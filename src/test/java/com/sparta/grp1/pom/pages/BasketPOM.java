package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPOM extends AbstractPOM{
    private WebDriver webDriver;

    public BasketPOM(WebDriver webDriver){
        this.webDriver = webDriver;
        goToBasketPage();
    }

    public void goToBasketPage(){
        webDriver.get("https://www.saucedemo.com/cart.html");
    }

    // work in progress
    public boolean goToCheckoutPage(){
        webDriver.findElement(By.id("checkout")).click();
        return getPageURL().equals("https://www.saucedemo.com/checkout-step-one.html");
    }

    public boolean goToProductsPage(){
        webDriver.findElement(By.id("continue-shopping")).click();
        return getPageURL().equals("https://www.saucedemo.com/inventory.html");
    }

}
