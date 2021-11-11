package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class COCompletePOM {

    private WebDriver webDriver;

    public  COCompletePOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void goToCompleteCheckoutPage(){
        webDriver.findElement(By.id("shopping_cart_container")).click();
        webDriver.findElement(By.id("checkout")).click();
        webDriver.findElement(By.id("first-name")).sendKeys("test");
        webDriver.findElement(By.id("last-name")).sendKeys("test");
        webDriver.findElement(By.id("postal-code")).sendKeys("test");
        webDriver.findElement(By.id("continue")).click();
        webDriver.findElement(By.id("finish")).click();
    }

    public void goToBackHomeFromComplete(){
        webDriver.findElement(By.id("back-to-products")).click();
    }

    public boolean productsPageFromComplete(){
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }

    public boolean checkIfUserIsOnCompletePage(){
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-complete.html");
    }

    public boolean thankYouMessageIsDisplayed(){
        return webDriver.findElement(By.className("complete-header")).getText().contains("THANK YOU FOR YOUR ORDER");
    }
}
