package com.sparta.grp1.pom.pages;

import com.sparta.grp1.cucumber.stepdefs.StepDefStateManager;
import org.openqa.selenium.WebDriver;

public class COStepTwoPOM extends StepDefStateManager {
    private WebDriver webDriver;

    public COStepTwoPOM(WebDriver webDriver) {
        setWebDriver(webDriver);
    }
}
