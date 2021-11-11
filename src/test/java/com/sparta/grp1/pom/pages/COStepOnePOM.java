package com.sparta.grp1.pom.pages;


import com.sparta.grp1.cucumber.stepdefs.StepDefStateManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class COStepOnePOM {

    private WebDriver webDriver;

    public COStepOnePOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void goToStepOneCheckout(){
        webDriver.findElement(By.id("shopping_cart_container")).click();
        webDriver.findElement(By.id("checkout")).click();
    }

    public void enterValidInfo(){
        webDriver.findElement(By.id("first-name")).sendKeys("test");
        webDriver.findElement(By.id("last-name")).sendKeys("test");
        webDriver.findElement(By.id("postal-code")).sendKeys("test");
    }

    public void clickContinue(){
        webDriver.findElement(By.id("continue")).click();
    }

    public boolean checkIfUserContinued(){
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html");
    }

    public void invalidFirstName(){
        webDriver.findElement(By.id("last-name")).sendKeys("test");
        webDriver.findElement(By.id("postal-code")).sendKeys("test");
        webDriver.findElement(By.id("continue")).click();
    }

    public boolean errorMessage(){
       return webDriver.findElement(By.className("error-button")).isEnabled();
    }

    public void invalidLastName(){
        webDriver.findElement(By.id("first-name")).sendKeys("test");
        webDriver.findElement(By.id("postal-code")).sendKeys("test");
        webDriver.findElement(By.id("continue")).click();
    }

    public void invalidZipCode(){
        webDriver.findElement(By.id("first-name")).sendKeys("test");
        webDriver.findElement(By.id("last-name")).sendKeys("test");
        webDriver.findElement(By.id("continue")).click();
    }

    public void clickCancel(){
        webDriver.findElement(By.id("cancel")).click();
    }

    public boolean userIsBackToBasketPage(){
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/cart.html");
    }

    public boolean checkIfUserIsOnOverviewPage(){
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html");
    }




}
