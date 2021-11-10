package com.sparta.grp1.pom.pages;

import org.openqa.selenium.WebDriver;

public class AbstractPOM {

    private static WebDriver webDriver;

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static String getPageURL(){
       return webDriver.getCurrentUrl();
    }

}
