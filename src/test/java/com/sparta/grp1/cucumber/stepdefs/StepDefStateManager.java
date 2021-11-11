package com.sparta.grp1.cucumber.stepdefs;

import com.sparta.grp1.pom.pages.BasketPOM;
import com.sparta.grp1.pom.pages.LoginPOM;
import com.sparta.grp1.pom.pages.ProductsPOM;
import com.sparta.grp1.pom.util.DriverFactory;
import com.sparta.grp1.pom.util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class StepDefStateManager {

    //private static boolean initialized = false;
    private WebDriver webDriver;
    private static final String DRIVER_LOCATION = "src/test/resources/drivers/chromedriver.exe";
    private static ChromeDriverService service;


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

    public enum userName{
        STANDARD_USER,LOCKED_OUT_USER,PROBLEM_USER,PERFORMANCE_GLITCH_USER
    }

    public String getUserName(LoginPOM.userName user){
        switch(user){
            case STANDARD_USER:
                return "standard_user";
            case LOCKED_OUT_USER:
                return "locked_out_user";
            case PROBLEM_USER:
                return "problem_user";
            case PERFORMANCE_GLITCH_USER:
                return "performance_glitch_user";
            default:
                return "standard_user";
        }
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

        getWebDriver().findElement(By.id("user-name")).sendKeys(getUserName(LoginPOM.userName.STANDARD_USER)); //may need to press login button instead
        getWebDriver().findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);

    }

    @After
    public void teardownAll() {
        webDriver.close();
        webDriver.quit();
    }


}
