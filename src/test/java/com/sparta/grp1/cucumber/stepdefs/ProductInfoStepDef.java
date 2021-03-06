package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.ProductInfoPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class ProductInfoStepDef {
    private static ProductInfoPOM productInfoPOM;
    private StepDefStateManager stepDefStateManager;

    // PicoContainer injects class StepDefStateManager
    public ProductInfoStepDef (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I am on the products page")
    public void iAmOnTheProductsPage() {
        productInfoPOM = new ProductInfoPOM(stepDefStateManager.getWebDriver());
        //login to get to products page
    }

    @When("I click on the product {string} name tag")
    public void iClickOnTheProductNameTag(String arg0) {
        productInfoPOM.clickOnProductName(arg0);
    }

    @Then("I will go to the products info page for {string}")
    public void iWillGoToTheProductsInfoPageFor(String arg0) {
        assertTrue(productInfoPOM.isOnProductInfoPage(arg0));
    }

    @When("I click on the image for product {string}")
    public void iClickOnTheImageForProduct(String arg0) {
        productInfoPOM.clickOnProductPhoto(arg0);
    }

    @And("Go back to products page")
    public void goBackToProductsPage() {
        productInfoPOM.goBack();
    }
}
