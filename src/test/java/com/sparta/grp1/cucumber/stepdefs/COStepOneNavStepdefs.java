package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.COStepOnePOM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class COStepOneNavStepdefs {

    private static COStepOnePOM coStepOnePOM;
    private StepDefStateManager stepDefStateManager;

    // PicoContainer injects class ContextSteps
    public COStepOneNavStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }


    @When("I enter all the valid information")
    public void iEnterAllTheValidInformation() {
    }

    @Then("I go to the checkout: overview page")
    public void iGoToTheCheckoutOverviewPage() {
    }

    @When("I click the cancel link")
    public void iClickTheCancelLink() {
    }

    @Then("I go back to the basket page")
    public void iGoBackToTheBasketPage() {
    }
}
