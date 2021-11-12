package com.sparta.grp1.pom.fragements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaTagsPOM {
    private WebDriver webDriver;
    private String originalWindow;

    public SocialMediaTagsPOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnSocialMediaTag(String id) {
        originalWindow = webDriver.getWindowHandle();

        webDriver.findElement(By.className(id)).click();
        List<String> windows = new ArrayList();
        windows.addAll(webDriver.getWindowHandles());
        webDriver.switchTo().window(windows.get(1));
    }

    public boolean isSocialMediaPage(String id) {
        System.out.println(webDriver.getCurrentUrl());
        return webDriver.getCurrentUrl().contains(id);
    }

    public void goToOriginalTab() {
        //close the new tab
        webDriver.close();
        //return to the first tab
        webDriver.switchTo().window(originalWindow);
    }
}
