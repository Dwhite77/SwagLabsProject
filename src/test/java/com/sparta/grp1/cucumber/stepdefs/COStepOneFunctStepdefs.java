package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.COStepOnePOM;
import com.sparta.grp1.pom.pages.COStepTwoPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class COStepOneFunctStepdefs {

    private static COStepOnePOM coStepOnePOM;
    private StepDefStateManager stepDefStateManager;

    // PicoContainer injects class ContextSteps
    public COStepOneFunctStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I am on the checkout: your information page")
    public void iAmOnTheCheckoutYourInformationPage() {
    }

    @When("I enter valid information")
    public void iEnterValidInformation() {
    }

    @And("I click the continue link")
    public void iClickTheContinueLink() {
    }

    @Then("I am able to proceed")
    public void iAmAbleToProceed() {
    }

    @When("I enter an invalid first name")
    public void iEnterAnInvalidFirstName() {
    }

    @Then("an error message appears")
    public void anErrorMessageAppears() {
    }

    @When("I enter an invalid last name")
    public void iEnterAnInvalidLastName() {
    }

    @When("I enter an invalid zip code")
    public void iEnterAnInvalidZipCode() {
    }
}
