package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductInfoPOM extends AbstractPOM {

    public ProductInfoPOM(WebDriver webDriver) {
        setWebDriver(webDriver);
    }

    public void loginToPage(String username) {
        getWebDriver().get(getBaseURL());
        getWebDriver().findElement(By.id("user-name")).sendKeys(username);
        getWebDriver().findElement(By.id("password")).sendKeys("secret_sauce");
        getWebDriver().findElement(By.id("login-button")).click();
    }

    public void clickOnProductName(String id) {
        clickById("item_"+id+"_title_link");
    }

    public void clickOnProductPhoto(String id) {
        clickById("item_"+id+"_img_link");
    }

    private void clickById(String id) {
        getWebDriver().findElement(By.id(id)).click();
    }

    public boolean isOnProductInfoPage(String id) {
        return ("https://www.saucedemo.com/inventory-item.html?id="+id)
                .equals(getWebDriver().getCurrentUrl());
    }
}
