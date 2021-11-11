package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.BasketPOM;
import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class StepDefStateManager {
    private static boolean initialized = false;
    private WebDriver webDriver;
    private static final String DRIVER_LOCATION = "src/test/resources/drivers/chromedriver.exe";
    private static ChromeDriverService service;
    private static BasketPOM basketPOM;

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public String getPageURL(){
       return webDriver.getCurrentUrl();
    }

    public String getBaseURL() {
        return "https://www.saucedemo.com/";
    }

    public static BasketPOM getBasketPOM() {
        return basketPOM;
    }

    public static void setBasketPOM(BasketPOM basketPOM) {
        StepDefStateManager.basketPOM = basketPOM;
    }

    @Before
    public void setUp() throws Exception {
        // initialize the driver
        DriverUtil.setDriverLocation(DRIVER_LOCATION);
        service = DriverUtil.getChromeDriverService(DRIVER_LOCATION);
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1265,1380");
        webDriver = DriverFactory.getWebDriver(DriverFactory.Browsers.CHROME, service, chromeOptions);
        webDriver.get(getBaseURL());
        System.out.println(webDriver.getCurrentUrl());
    }

    @After
    public void teardownAll() {
        webDriver.close();
        webDriver.quit();
    }


}
