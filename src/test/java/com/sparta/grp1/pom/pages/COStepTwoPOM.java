package com.sparta.grp1.pom.pages;

import com.sparta.grp1.cucumber.stepdefs.SepDefStateManager;
import org.openqa.selenium.WebDriver;

public class COStepTwoPOM extends SepDefStateManager {
    private WebDriver webDriver;

    public COStepTwoPOM(WebDriver webDriver) {
        setWebDriver(webDriver);
    }
}
