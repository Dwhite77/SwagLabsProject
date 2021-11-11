package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.BasketPOM;
import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

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
        Assertions.assertTrue(StepDefStateManager.getBasketPOM().hasCheckoutPageLink());
    }

    @When("I click the continue shopping link")
    public void iClickTheContinueShoppingLink() {
    }

    @Then("I go back to the products page")
    public void iGoBackToTheProductsPage() {
        Assertions.assertTrue(StepDefStateManager.getBasketPOM().hasProductPageLink());
    }

    @When("I click the item link")
    public void iClickTheItemLink() {
    }

    @Then("I go to the correct item page")
    public void iGoToTheCorrectItemPage() {
    }


}
