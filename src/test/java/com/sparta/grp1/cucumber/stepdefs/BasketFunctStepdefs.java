package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.BasketPOM;
import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class BasketFunctStepdefs {

    private StepDefStateManager stepDefStateManager;

    public BasketFunctStepdefs(StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }


    @Given("I am on the basket page")
    public void iAmOnTheBasketPage() {
        stepDefStateManager.setBasketPOM();
    }

    @When("I view my items")
    public void iViewMyItems() {
        StepDefStateManager.getBasketPOM().addItemToBasket();
    }

    @Then("I see the correct items")
    public void iSeeTheCorrectItems() {
        Assertions.assertEquals("Sauce Labs Backpack", StepDefStateManager.getBasketPOM().lookForBasketInItem());
    }

    @Given("I am have items in the basket")
    public void iAmHaveItemsInTheBasket() {
        stepDefStateManager.setBasketPOM();
        StepDefStateManager.getBasketPOM().addItemToBasket();
    }

    @When("I remove an item")
    public void iRemoveAnItem() {
        StepDefStateManager.getBasketPOM().removeBasketItem();
    }

    @Then("the correct item is removed")
    public void theCorrectItemIsRemoved() {
        Assertions.assertEquals(0, StepDefStateManager.getBasketPOM().numberOfItemsInBasket());
    }



}
