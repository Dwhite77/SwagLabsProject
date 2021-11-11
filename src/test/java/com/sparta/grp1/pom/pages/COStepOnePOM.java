package com.sparta.grp1.pom.pages;

import com.sparta.grp1.cucumber.stepdefs.StepDefStateManager;
import org.openqa.selenium.WebDriver;

public class COStepOnePOM extends StepDefStateManager {
    private WebDriver webDriver;

    public COStepOnePOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


}
