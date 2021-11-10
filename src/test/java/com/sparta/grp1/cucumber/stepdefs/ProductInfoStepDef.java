package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ProductInfoStepDef {
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
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        webDriver = DriverFactory.getWebDriver(DriverFactory.Browsers.CHROME,service, chromeOptions);
        //login to get to products page
        webDriver.get("https://www.saucedemo.com/");
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
    }

    @Given("I am on the products page")
    public void iAmOnTheProductsPage() {
        //assertEquals("https://www.saucedemo.com/inventory.html", webDriver.getCurrentUrl());
    }

    @When("I click on the product {string} name tag")
    public void iClickOnTheProductNameTag(String arg0) {
        webDriver.findElement(By.id("item_"+arg0+"_title_link")).click();
    }

    @Then("I will go to the products info page for {string}")
    public void iWillGoToTheProductsInfoPageFor(String arg0) {
        assertEquals("https://www.saucedemo.com/inventory-item.html?id="+arg0, webDriver.getCurrentUrl());
    }

    @When("I click on the image for product {string}")
    public void iClickOnTheImageForProduct(String arg0) {
        webDriver.findElement(By.id("item_"+arg0+"_img_link")).click();
    }

    @After
    public void teardownAll() {
        webDriver.close();
        service.stop();
        //webDriver.quit();
    }

    @And("Go back to products page")
    public void goBackToProductsPage() {
        webDriver.navigate().back();
    }
}
