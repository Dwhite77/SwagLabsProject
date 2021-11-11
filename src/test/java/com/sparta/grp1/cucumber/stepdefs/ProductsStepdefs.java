package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.LoginPOM;
import com.sparta.grp1.pom.pages.ProductsPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ProductsStepdefs {

    private static ProductsPOM productsPOM;
    private StepDefStateManager stepDefStateManager;

    // PicoContainer injects class ContextSteps
    public ProductsStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }



    @Given("I am on the all items page")
    public void iAmOnTheAllItemsPage() {
        productsPOM = new ProductsPOM(stepDefStateManager.getWebDriver());
    }

    @And("The ordering is A-Z")
    public void theOrderingIsAZ() {
    }

    @When("I click on the ordering dropdown")
    public void iClickOnTheOrderingDropdown() {
        productsPOM.openDropDown();
    }

    @And("Click Name\\(A-Z)")
    public void clickNameAZ() {
        productsPOM.clickName(0);
    }

    @Then("The item ordering should be A-Z")
    public void theItemOrderingShouldBeAZ() {
        Assertions.assertEquals("ordering is A-Z", productsPOM.getOrder());

    }
    //-----------------------------------------------
    @And("The ordering is Z-A")
    public void theOrderingIsZA() {
        productsPOM.openDropDown();
        productsPOM.clickName(1);
    }
    //-----------------------------------------------
    @And("Click Name\\(Z-A)")
    public void clickNameZA() {
        productsPOM.clickName(1);
    }

    @Then("The item ordering should be Z-A")
    public void theItemOrderingShouldBeZA() {
        Assertions.assertEquals("ordering is Z-A", productsPOM.getOrder());
    }
    //-----------------------------------------------
    @And("Click Price\\(L-H)")
    public void clickPriceLH() {
        productsPOM.clickName(2);
    }

    @Then("The item ordering should be Price\\(L-H)")
    public void theItemOrderingShouldBePriceLH() {
        Assertions.assertEquals("ordering is L-H", productsPOM.getOrder());
    }
    //-----------------------------------------------
    @And("The ordering is Price\\(L-H)")
    public void theOrderingIsPriceLH() {
        productsPOM.openDropDown();
        productsPOM.clickName(2);
    }

    @And("Click Price\\(H-L)")
    public void clickPriceHL() {
        productsPOM.clickName(3);
    }

    @Then("The item ordering should be Price\\(H-L)")
    public void theItemOrderingShouldBePriceHL() {
        Assertions.assertEquals("ordering is H-L", productsPOM.getOrder());
    }
    //-----------------------------------------------
    @And("The ordering is Price\\(H-L)")
    public void theOrderingIsPriceHL() {
        productsPOM.openDropDown();
        productsPOM.clickName(3);
    }


}
