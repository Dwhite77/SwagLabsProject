package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductInfoPOM {

    private WebDriver webDriver;

    public ProductInfoPOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnProductName(String id) {
        clickById("item_"+id+"_title_link");
    }

    public void clickOnProductPhoto(String id) {
        clickById("item_"+id+"_img_link");
    }

    private void clickById(String id) {
        webDriver.findElement(By.id(id)).click();
    }

    public boolean isOnProductInfoPage(String id) {
        return ("https://www.saucedemo.com/inventory-item.html?id="+id)
                .equals(webDriver.getCurrentUrl());
    }

    public void goBack() {
        webDriver.navigate().back();
    }
}
