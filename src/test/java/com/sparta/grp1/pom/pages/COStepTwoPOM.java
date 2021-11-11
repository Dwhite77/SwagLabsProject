package com.sparta.grp1.pom.pages;

import com.sparta.grp1.cucumber.stepdefs.AbstractPOM;
import org.openqa.selenium.WebDriver;

public class COStepTwoPOM extends AbstractPOM {
    private WebDriver webDriver;

    public COStepTwoPOM(WebDriver webDriver) {
        setWebDriver(webDriver);
    }
}
