package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.COCompletePOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class COCompleteDisplayStepdefs {

    private StepDefStateManager stepDefStateManager;
    private static COCompletePOM coCompletePOM;

    public COCompleteDisplayStepdefs(StepDefStateManager stepDefStateManager){
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I am on the checkout: overview page")
    public void iAmOnTheCheckoutOverviewPage() {
        coCompletePOM = new COCompletePOM(stepDefStateManager.getWebDriver());
        coCompletePOM.goToCompleteCheckoutPage();
    }

    @When("I am viewing the page")
    public void iAmViewingThePage() {
        coCompletePOM.checkIfUserIsOnCompletePage();
    }

    @Then("I should see a thank you message")
    public void iShouldSeeAThankYouMessage() {
        coCompletePOM.thankYouMessageIsDisplayed();
    }
}
