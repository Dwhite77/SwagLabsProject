package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.LoginPOM;
import com.sparta.grp1.pom.pages.ResetAppStatePOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ResetAppStateStepdefs {

    private static LoginPOM loginPOM;
    private static ResetAppStatePOM resetAppStatePOM;
    private StepDefStateManager stepDefStateManager;

    public ResetAppStateStepdefs(StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given(": The user is logged in with one item in the basket")
    public void theUserIsLoggedInWithOneItemInTheBasket() {
        loginPOM = new LoginPOM(stepDefStateManager.getWebDriver());
        resetAppStatePOM = new ResetAppStatePOM(stepDefStateManager.getWebDriver());
        loginPOM.loginToProductsPage(LoginPOM.userName.STANDARD_USER);
        resetAppStatePOM.userAddsItemToBasket();

    }

    @When(": The user clicks on the reset app state button")
    public void theUserClicksOnTheResetAppStateButton() {
        resetAppStatePOM.userClicksOnAppResetButton();
    }

    @Then(": The basket will be empty")
    public void theBasketWillBeEmpty() {
        resetAppStatePOM.checkIfBasketIsEmpty();
    }
}


