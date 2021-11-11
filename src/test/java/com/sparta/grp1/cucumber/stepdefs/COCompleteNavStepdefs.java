package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.COCompletePOM;
import com.sparta.grp1.pom.pages.LoginPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class COCompleteNavStepdefs {

    private StepDefStateManager stepDefStateManager;
    private static COCompletePOM coCompletePOM;

    public COCompleteNavStepdefs(StepDefStateManager stepDefStateManager){
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I am on the checkout: complete page")
    public void iAmOnTheCheckoutCompletePage() {
        coCompletePOM = new COCompletePOM(stepDefStateManager.getWebDriver());
        coCompletePOM.goToCompleteCheckoutPage();
    }

    @When("I click back home link")
    public void iClickBackHomeLink() {
        coCompletePOM.goToBackHomeFromComplete();
    }

    @Then("I go to the product page")
    public void iGoToTheProductPage() {
        coCompletePOM.productsPageFromComplete();
    }

    @Given("I am on the checkout: overview")
    public void iAmOnTheCheckoutOverview() {
    }
}
