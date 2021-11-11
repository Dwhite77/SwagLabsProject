package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.LoginPOM;
import com.sparta.grp1.pom.pages.LogoutPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepdefs {

    private static LogoutPOM logoutPOM;
    private static LoginPOM loginPOM;
    private StepDefStateManager stepDefStateManager;

    public LogoutStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given(": The user is logged in")
    public void theUserIsLoggedIn() {
        loginPOM = new LoginPOM(stepDefStateManager.getWebDriver());
        logoutPOM = new LogoutPOM(stepDefStateManager.getWebDriver());
    }

    @When(": The user clicks on the logout button")
    public void theUserClicksOnTheLogoutButton() {
        logoutPOM.loggingOut();
    }

    @Then(": The user should be directed to the login page")
    public void theUserShouldBeDirectedToTheLoginPage() {
        logoutPOM.checkIfLoggedOut();
    }


}
