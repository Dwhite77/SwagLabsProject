package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetAppStatePOM {

    private WebDriver webDriver;

    public ResetAppStatePOM(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public boolean checkIfAppStateWasReset(){
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        webDriver.findElement(By.id("react-burger-menu-btn")).click();
        webDriver.findElement(By.id("reset_sidebar_link")).click();

        return webDriver.findElement(By.className("shopping_cart_badge")).isEnabled(); // check if this class is still enabled


    }


}