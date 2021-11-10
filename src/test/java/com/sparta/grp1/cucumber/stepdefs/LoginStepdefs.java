package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.LoginPOM;
import com.sparta.grp1.pom.pages.ProductsPOM;
import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    public void teardownAll() {
        webDriver.close();
        webDriver.quit();
    }


}
