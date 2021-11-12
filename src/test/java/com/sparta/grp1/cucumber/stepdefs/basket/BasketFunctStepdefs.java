package com.sparta.grp1.cucumber.stepdefs.basket;

import com.sparta.grp1.cucumber.stepdefs.util.StepDefStateManager;
import com.sparta.grp1.pom.pages.ProductsPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BasketFunctStepdefs {

    private StepDefStateManager stepDefStateManager;

    public BasketFunctStepdefs(StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }


    @Given("I am on the basket page")
    public void iAmOnTheBasketPage() {
        stepDefStateManager.setBasketPOM();
        ProductsPOM.addAllProducts();
    }

    @When("I view my items")
    public void iViewMyItems() {
        StepDefStateManager.getBasketPOM().addItemToBasket(4);
    }

    @Then("I see the correct items")
    public void iSeeTheCorrectItems() {
        Assertions.assertEquals("Sauce Labs Backpack", StepDefStateManager.getBasketPOM().lookForBasketInItem(4));
    }

    @Given("I am have items in the basket")
    public void iAmHaveItemsInTheBasket() {
        stepDefStateManager.setBasketPOM();
        StepDefStateManager.getBasketPOM().addItemToBasket(4);
    }

    @When("I remove an item")
    public void iRemoveAnItem() {
        StepDefStateManager.getBasketPOM().removeBasketItem(4);
    }

    @Then("the correct item is removed")
    public void theCorrectItemIsRemoved() {
        Assertions.assertEquals(0, StepDefStateManager.getBasketPOM().numberOfItemsInBasket());
    }



}
