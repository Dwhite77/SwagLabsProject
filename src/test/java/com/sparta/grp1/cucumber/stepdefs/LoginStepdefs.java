package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.LoginPOM;
import com.sparta.grp1.pom.pages.ProductsPOM;
import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;


public class LoginStepdefs {

    private static final String DRIVER_LOCATION = "src/test/resources/drivers/chromedriver.exe";
    private static ChromeDriverService service;
    private WebDriver webDriver;
    private LoginPOM loginPOM;

    @Before
    public void initAll() {
        DriverUtil.setDriverLocation(DRIVER_LOCATION);
        service = DriverUtil.getChromeDriverService(DRIVER_LOCATION);
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1265,1380"); // this is the fix, only works for this one browser window size, actually works for a couple of sizes but not full screen
        webDriver = DriverFactory.getWebDriver(DriverFactory.Browsers.CHROME, service, chromeOptions);
        loginPOM = new LoginPOM(webDriver);


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

    @After
    public void teardownAll() {
        webDriver.close();
        webDriver.quit();
    }
}
