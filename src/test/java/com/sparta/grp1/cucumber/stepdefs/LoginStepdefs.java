package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginStepdefs {

    private static final String DRIVER_LOCATION = "src/test/resources/drivers/chromedriver.exe";

    @Before
    public void initAll(){

    }

    @When("Standard user enters the correct username and password")
    public void standardUserEntersTheCorrectUsernameAndPassword() {
    }

    @Then("The user will be redirected to the product page")
    public void theUserWillBeRedirectedToTheProductPage() {
    }

    @When("Locked out user  enters the correct username and password")
    public void lockedOutUserEntersTheCorrectUsernameAndPassword() {
    }

    @Then("The user will be shown a message that they are locked out")
    public void theUserWillBeShownAMessageThatTheyAreLockedOut() {
    }

    @When("Problem user enters the correct username and password")
    public void problemUserEntersTheCorrectUsernameAndPassword() {
    }

    @When("Performance glitch user enters the correct username and password")
    public void performanceGlitchUserEntersTheCorrectUsernameAndPassword() {
    }

    @When("User enters the incorrect username or password")
    public void userEntersTheIncorrectUsernameOrPassword() {
    }

    @Then("The user will be displayed an error message")
    public void theUserWillBeDisplayedAnErrorMessage() {
    }

    @When("User enters no incorrect username or password")
    public void userEntersNoIncorrectUsernameOrPassword() {
    }

    @After
    public void teardownAll(){
    }
}
