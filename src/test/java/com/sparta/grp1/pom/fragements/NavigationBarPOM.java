package com.sparta.grp1.pom.fragements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NavigationBarPOM {

    private WebDriver webDriver;

    public NavigationBarPOM(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void openingNavBar(){
        webDriver.findElement(By.className("bm-burger-button")).click();
        webDriver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    public void openingAllItemsPage(){
        webDriver.findElement(By.id("inventory_sidebar_link")).click();
    }
    public boolean checkIamOnAllItemsPage(){
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }

    public void openingAboutPage(){
        webDriver.findElement(By.id("about_sidebar_link")).click();
    }

    public boolean checkIamOnAboutPage(){
        return webDriver.getCurrentUrl().equals("https://saucelabs.com/");
    }






}
