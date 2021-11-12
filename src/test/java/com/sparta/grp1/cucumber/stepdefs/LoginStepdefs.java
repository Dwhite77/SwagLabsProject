package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.LoginPOM;

import com.sparta.grp1.pom.pages.LogoutPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


public class LoginStepdefs {

    private static LoginPOM loginPOM;
    private static LogoutPOM logoutPOM;
    private StepDefStateManager stepDefStateManager;




    public LoginStepdefs (StepDefStateManager stepDefStateManager) {
        this.stepDefStateManager = stepDefStateManager;
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {

        loginPOM = new LoginPOM(stepDefStateManager.getWebDriver());
        logoutPOM =new LogoutPOM(stepDefStateManager.getWebDriver());
        logoutPOM.loggingOut();

    }

    @When("Standard user enters the correct username and password")
    public void standardUserEntersTheCorrectUsernameAndPassword() {
        loginPOM.loginToProductsPage(LoginPOM.userName.STANDARD_USER);
    }

    @Then("The user will be redirected to the product page")
    public void theUserWillBeRedirectedToTheProductPage() {
        loginPOM.loginSuccessful();
    }

    @When("Locked out user  enters the correct username and password")
    public void lockedOutUserEntersTheCorrectUsernameAndPassword() {
        loginPOM.loginToProductsPage(LoginPOM.userName.LOCKED_OUT_USER);
    }

    @Then("The user will be shown a message that they are locked out")
    public void theUserWillBeShownAMessageThatTheyAreLockedOut() {
        loginPOM.lockedOutMessage();
    }

    @When("Problem user enters the correct username and password")
    public void problemUserEntersTheCorrectUsernameAndPassword() {
        loginPOM.loginToProductsPage(LoginPOM.userName.PROBLEM_USER);
    }

    @When("Performance glitch user enters the correct username and password")
    public void performanceGlitchUserEntersTheCorrectUsernameAndPassword() {
        loginPOM.loginToProductsPage(LoginPOM.userName.PERFORMANCE_GLITCH_USER);
    }

    @When("User enters the incorrect username or password")
    public void userEntersTheIncorrectUsernameOrPassword() {
        loginPOM.invalidLogin();
    }

    @Then("The user will be displayed an error message")
    public void theUserWillBeDisplayedAnErrorMessage() {
        loginPOM.invalidLoginMessage();
    }

    @When("User enters no username")
    public void userEntersNoUsername() {
        loginPOM.noUsernameLogin();
    }

    @Then("The user will be displayed a username error message")
    public void theUserWillBeDisplayedAUsernameErrorMessage() {
        loginPOM.invalidLoginMessageUsername();
    }

    @When("User enters no password")
    public void userEntersNoPassword() {
        loginPOM.noPasswordLogin();
    }

    @Then("The user will be displayed a password error message")
    public void theUserWillBeDisplayedAPasswordErrorMessage() {
        loginPOM.invalidLoginMessagePassword();
    }

    @When("cookie has expired")
    public void cookieHasExpired() {loginPOM.inValidateSession();}

    @Then("user should be logged out")
    public void userShouldBeLoggedOut() {assertFalse(loginPOM.loginSuccessful());}

    @And("a reason should be displayed")
    public void aReasonShouldBeDisplayed() {
        assertTrue(loginPOM.invalidLogin());
    }
}
