package com.sparta.grp1.cucumber.stepdefs.footer;

import com.sparta.grp1.cucumber.stepdefs.util.StepDefStateManager;
import com.sparta.grp1.pom.fragements.CopyrightTextPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CopyrightStepDefs {
    private StepDefStateManager stepDefStateManager;
    private static CopyrightTextPOM copyrightTextPOM;

    // PicoContainer injects class StepDefStateManager
    public CopyrightStepDefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
        copyrightTextPOM = new CopyrightTextPOM(stepDefStateManager.getWebDriver());
    }

    @Given("The year is {int}")
    public void theYearIs(int arg0) {
        copyrightTextPOM.hasCorrectYear(arg0);
    }

    @Then("Copyright information should have the same year")
    public void copyrightInformationShouldHaveTheSameYear() {

    }

}
