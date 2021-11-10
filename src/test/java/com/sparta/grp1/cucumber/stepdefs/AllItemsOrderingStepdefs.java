package com.sparta.grp1.cucumber.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllItemsOrderingStepdefs {

    private static final String DRIVER_LOCATION = "src/test/resources/drivers/chromedriver.exe";


    @Before
    public void initAll(){
    }


    @Given("I am on the all items page")
    public void iAmOnTheAllItemsPage() {
    }

    @And("The ordering is A-Z")
    public void theOrderingIsAZ() {
    }

    @When("I click on the ordering dropdown")
    public void iClickOnTheOrderingDropdown() {
    }

    @And("Click Name\\(A-Z)")
    public void clickNameAZ() {
    }

    @Then("The item ordering should be A-Z")
    public void theItemOrderingShouldBeAZ() {
    }

    @And("The ordering is Z-A")
    public void theOrderingIsZA() {
    }

    @And("Click Name\\(Z-A)")
    public void clickNameZA() {
    }

    @Then("The item ordering should be Z-A")
    public void theItemOrderingShouldBeZA() {
    }

    @And("Click Price\\(L-H)")
    public void clickPriceLH() {
    }

    @Then("The item ordering should be Price\\(L-H)")
    public void theItemOrderingShouldBePriceLH() {
    }

    @And("The ordering is Price\\(L-H)")
    public void theOrderingIsPriceLH() {
    }

    @And("Click Price\\(H-L)")
    public void clickPriceHL() {
    }

    @Then("The item ordering should be Price\\(H-L)")
    public void theItemOrderingShouldBePriceHL() {
    }

    @And("The ordering is Price\\(H-L)")
    public void theOrderingIsPriceHL() {
    }

    @After
    public void teardownAll(){
    }
}
