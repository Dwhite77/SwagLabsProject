package com.sparta.grp1.cucumber.stepdefs.checkout;

import com.sparta.grp1.cucumber.stepdefs.util.StepDefStateManager;
import com.sparta.grp1.pom.pages.COStepTwoPOM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class COStepTwoFunctStepdefs {

    private static COStepTwoPOM coStepTwoPOM;
    private StepDefStateManager stepDefStateManager;

    // PicoContainer injects class ContextSteps
    public COStepTwoFunctStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }


    @When("I am viewing the order details")
    public void iAmViewingTheOrderDetails() {
        coStepTwoPOM = new COStepTwoPOM(stepDefStateManager.getWebDriver());
        //coStepTwoPOM.goToStep2Page();

    }

    @Then("There should be payment information")
    public void thereShouldBePaymentInformation() {
        Assertions.assertEquals(true, coStepTwoPOM.checkPaymentInfo());
    }

    @Then("There should be shipping information")
    public void thereShouldBeShippingInformation() {
        Assertions.assertEquals(true, coStepTwoPOM.checkShippingInfo());
    }

    @Then("There should be correct total cost including tax")
    public void thereShouldBeCorrectTotalCostIncludingTax() {
        Assertions.assertEquals(true, coStepTwoPOM.checkTotal());
    }

    @Then("I should see a list of all the selected products from basket")
    public void iShouldSeeAListOfAllTheSelectedProductsFromBasket() {
    }
}
