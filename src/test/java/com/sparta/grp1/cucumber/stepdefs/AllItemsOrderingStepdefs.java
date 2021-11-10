package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.LoginPOM;
import com.sparta.grp1.pom.pages.ProductsPOM;
import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class AllItemsOrderingStepdefs {

    private static final String DRIVER_LOCATION = "src/test/resources/drivers/chromedriver.exe";
    private static ChromeDriverService service;
    private WebDriver webDriver;
    private LoginPOM loginPOM;
    private ProductsPOM productsPOM;

    @Before
    public void initAll(){
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
        productsPOM = new ProductsPOM(webDriver);
    }


    @Given("I am on the all items page")
    public void iAmOnTheAllItemsPage() {
        loginPOM.loginToProductsPage(LoginPOM.userName.STANDARD_USER);
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
    }

    @Then("The item ordering should be A-Z")
    public void theItemOrderingShouldBeAZ() {
    }
    //-----------------------------------------------
    @And("The ordering is Z-A")
    public void theOrderingIsZA() {
    }
    //-----------------------------------------------
    @And("Click Name\\(Z-A)")
    public void clickNameZA() {
    }

    @Then("The item ordering should be Z-A")
    public void theItemOrderingShouldBeZA() {
    }
    //-----------------------------------------------
    @And("Click Price\\(L-H)")
    public void clickPriceLH() {
    }

    @Then("The item ordering should be Price\\(L-H)")
    public void theItemOrderingShouldBePriceLH() {
    }
    //-----------------------------------------------
    @And("The ordering is Price\\(L-H)")
    public void theOrderingIsPriceLH() {
    }

    @And("Click Price\\(H-L)")
    public void clickPriceHL() {
    }

    @Then("The item ordering should be Price\\(H-L)")
    public void theItemOrderingShouldBePriceHL() {
    }
    //-----------------------------------------------
    @And("The ordering is Price\\(H-L)")
    public void theOrderingIsPriceHL() {
    }

    @After
    public void teardownAll(){
        webDriver.close();
        webDriver.quit();
    }

}
