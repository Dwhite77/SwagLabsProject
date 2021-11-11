package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.BasketPOM;
import com.sparta.grp1.pom.pages.COStepTwoPOM;
import com.sparta.grp1.pom.pages.ProductsPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

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
        coStepTwoPOM.goToStep2Page();
    }

    @When("I am happy with the order information")
    public void iAmHappyWithTheOrderInformation() {

    }

    @And("I click the finish link")
    public void iClickTheFinishLink() {
        coStepTwoPOM.clickFinish();
    }

    @Then("I go to the order completion page")
    public void iGoToTheOrderCompletionPage() {
        Assertions.assertEquals("https://www.saucedemo.com/checkout-complete.html", stepDefStateManager.getPageURL());
    }


    @Then("I go back to the product page")
    public void iGoBackToTheProductPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", stepDefStateManager.getPageURL());
    }
}
