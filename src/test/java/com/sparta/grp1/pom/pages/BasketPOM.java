package com.sparta.grp1.pom.pages;

import com.sparta.grp1.cucumber.stepdefs.SepDefStateManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPOM extends SepDefStateManager {

    public BasketPOM(WebDriver webDriver){
        setWebDriver(webDriver);
        goToBasketPage();
    }

    public void goToBasketPage(){
        getWebDriver().get("https://www.saucedemo.com/cart.html");
    }

    // work in progress
    public boolean goToCheckoutPage() {
        getWebDriver().findElement(By.id("checkout")).click();
        return getPageURL().equals("https://www.saucedemo.com/checkout-step-one.html");
    }

    public boolean goToProductsPage(){
        getWebDriver().findElement(By.id("continue-shopping")).click();
        return getPageURL().equals("https://www.saucedemo.com/inventory.html");
    }

}
