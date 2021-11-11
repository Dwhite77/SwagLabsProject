package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.COStepTwoPOM;
import com.sparta.grp1.pom.pages.ProductsPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class COStepTwoNavStepdefs {

    private static COStepTwoPOM coStepTwoPOM;
    private StepDefStateManager stepDefStateManager;

    // PicoContainer injects class ContextSteps
    public COStepTwoNavStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }


    @Given("I am on the checkout: overview page")
    public void iAmOnTheCheckoutOverviewPage() {
        coStepTwoPOM = new COStepTwoPOM(stepDefStateManager.getWebDriver());
    }

    @When("I am happy with the order information")
    public void iAmHappyWithTheOrderInformation() {
    }

    @And("I click the finish link")
    public void iClickTheFinishLink() {
    }

    @Then("I go to the order completion page")
    public void iGoToTheOrderCompletionPage() {
    }

    @Given("I am on the checkout: overview")
    public void iAmOnTheCheckoutOverview() {
    }

    @Then("I go back to the product page")
    public void iGoBackToTheProductPage() {
    }
}
