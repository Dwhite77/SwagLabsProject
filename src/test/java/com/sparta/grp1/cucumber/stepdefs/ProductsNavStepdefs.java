package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.ProductsPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsNavStepdefs {

    private static ProductsPOM productsPOM;
    private StepDefStateManager stepDefStateManager;


    // PicoContainer injects class ContextSteps
    public ProductsNavStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @When("I click the basket button")
    public void iClickTheBasketButton() {
        productsPOM = new ProductsPOM(stepDefStateManager.getWebDriver());
        productsPOM.goToBasketPage();
    }

    @Then("I am taken to the basket page")
    public void iAmTakenToTheBasketPage() {
        stepDefStateManager.getPageURL().equals("https://www.saucedemo.com/cart.html");
    }



}
