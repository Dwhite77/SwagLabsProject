package com.sparta.grp1.cucumber.stepdefs.checkout;

import com.sparta.grp1.cucumber.stepdefs.util.StepDefStateManager;
import com.sparta.grp1.pom.pages.COStepOnePOM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class COStepOneNavStepdefs {


    private StepDefStateManager stepDefStateManager;
    private static COStepOnePOM coStepOnePOM;

    public COStepOneNavStepdefs(StepDefStateManager stepDefStateManager){
        this.stepDefStateManager = stepDefStateManager;
    }


    @When("I enter all the valid information")
    public void userEnterAllTheValidInformation() {
        coStepOnePOM = new COStepOnePOM(stepDefStateManager.getWebDriver());
        coStepOnePOM.enterValidInfo();
    }

    @Then("I go to the checkout: overview page")
    public void IGoToTheCheckoutOverviewPage() {
        coStepOnePOM.checkIfUserIsOnOverviewPage();
    }

    @When("I click the cancel link")
    public void IClickTheCancelLink() {
        coStepOnePOM = new COStepOnePOM(stepDefStateManager.getWebDriver());
        coStepOnePOM.clickCancel();
    }

    @Then("user go back to the basket page")
    public void userGoBackToTheBasketPage() {
        coStepOnePOM.userIsBackToBasketPage();
    }
}
