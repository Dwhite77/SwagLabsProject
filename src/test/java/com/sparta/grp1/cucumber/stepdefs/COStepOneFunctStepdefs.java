package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.COStepOnePOM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class COStepOneFunctStepdefs {


    private StepDefStateManager stepDefStateManager;
    private static COStepOnePOM coStepOnePOM;

    public COStepOneFunctStepdefs(StepDefStateManager stepDefStateManager){

        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I am on the checkout: your information page")
    public void iAmOnTheCheckoutYourInformationPage() {
        coStepOnePOM = new COStepOnePOM(stepDefStateManager.getWebDriver());
        coStepOnePOM.goToStepOneCheckout();
    }

    @When("I enter valid information")
    public void iEnterValidInformation() {
        coStepOnePOM.enterValidInfo();
    }

    @And("I click the continue link")
    public void iClickTheContinueLink() {
        coStepOnePOM.clickContinue();
    }

    @Then("I am able to proceed")
    public void iAmAbleToProceed() {
        coStepOnePOM.checkIfUserContinued();
    }

    @When("I enter an invalid first name")
    public void iEnterAnInvalidFirstName() {
        coStepOnePOM.invalidFirstName();
    }

    @Then("an error message appears")
    public void anErrorMessageAppears() {
        coStepOnePOM.errorMessage();
    }

    @When("I enter an invalid last name")
    public void iEnterAnInvalidLastName() {
        coStepOnePOM.invalidLastName();
    }

    @When("I enter an invalid zip code")
    public void iEnterAnInvalidZipCode() {
        coStepOnePOM.invalidZipCode();
    }
}
