package com.sparta.grp1.pom.pages;

import com.sparta.grp1.cucumber.stepdefs.util.StepDefStateManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ResetAppStatePOM extends StepDefStateManager {

    private WebDriver webDriver;

    public ResetAppStatePOM(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void userAddsItemToBasket(){
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    public void userClicksOnAppResetButton(){
        webDriver.findElement(By.className("bm-burger-button")).click();
        webDriver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
        webDriver.findElement(By.id("reset_sidebar_link")).click();
    }
    public boolean checkIfBasketIsEmpty(){
        return webDriver.findElements(By.className("shopping_cart_badge")).isEmpty();
    }



}
