package com.sparta.grp1.pom.pages;

import org.openqa.selenium.WebDriver;

public class AbstractPOM {

    private WebDriver webDriver;

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

}
