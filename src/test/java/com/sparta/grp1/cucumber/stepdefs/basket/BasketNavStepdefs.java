package com.sparta.grp1.cucumber.stepdefs.basket;

import com.sparta.grp1.cucumber.stepdefs.util.StepDefStateManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BasketNavStepdefs {

    private StepDefStateManager stepDefStateManager;

    public BasketNavStepdefs(StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @When("I click the checkout link")
    public void iClickTheCheckoutLink() {
    }

    @Then("I go to the checkout page")
    public void iGoToTheCheckoutPage() {
        StepDefStateManager.getBasketPOM().goToCheckoutPage();
        Assertions.assertEquals("https://www.saucedemo.com/checkout-step-one.html", stepDefStateManager.getPageURL());
    }

    @When("I click the continue shopping link")
    public void iClickTheContinueShoppingLink() {
    }

    @Then("I go back to the products page")
    public void iGoBackToTheProductsPage() {
        StepDefStateManager.getBasketPOM().goToProductsPage();
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", stepDefStateManager.getPageURL());
    }

    @When("I click the item link")
    public void iClickTheItemLink() {
    }

    @Then("I go to the correct item page")
    public void iGoToTheCorrectItemPage() {
        StepDefStateManager.getBasketPOM().goToItemPage(4);
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=4", stepDefStateManager.getPageURL());
    }


}
