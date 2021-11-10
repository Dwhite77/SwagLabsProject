package com.sparta.grp1.cucumber.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasketFunctStepdefs {

    @Before
    public void initAll(){
    }

    @Given("I am on the basket page")
    public void iAmOnTheBasketPage() {
    }

    @When("I view my items")
    public void iViewMyItems() {
    }

    @Then("I see the correct items")
    public void iSeeTheCorrectItems() {
    }

    @Then("I see the correct total")
    public void iSeeTheCorrectTotal() {
    }

    @Given("I am have items in the basket")
    public void iAmHaveItemsInTheBasket() {
    }

    @When("I remove an item")
    public void iRemoveAnItem() {
    }

    @Then("the correct item is removed")
    public void theCorrectItemIsRemoved() {
    }

    @Then("the total cost is correctly updated")
    public void theTotalCostIsCorrectlyUpdated() {
    }

    @After
    public void teardownAll(){
    }
}
