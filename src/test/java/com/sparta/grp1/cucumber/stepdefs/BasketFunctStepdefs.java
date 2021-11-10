package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class BasketFunctStepdefs {

    private WebDriver webDriver;
    private ChromeDriverService service;
    private static final String DRIVER_LOCATION = "src/test/resources/drivers/chromedriver.exe";


    @Before
    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions()
                .addArguments("--headless")
                .addArguments("--window-size=1265,1380");
        DriverUtil.setDriverLocation(DRIVER_LOCATION);
        service = DriverUtil.getChromeDriverService(DRIVER_LOCATION);
        webDriver = DriverFactory.getWebDriver(DriverFactory.Browsers.CHROME,service, chromeOptions);
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //login to get to products page
        webDriver.get("https://www.saucedemo.com/");
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
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
        webDriver.close();
        service.stop();
    }
}
