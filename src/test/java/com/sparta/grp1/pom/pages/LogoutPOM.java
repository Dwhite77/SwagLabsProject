package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class LogoutPOM {

    private WebDriver webDriver;

    public LogoutPOM(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void loggingOut(){

        webDriver.findElement(By.className("bm-burger-button")).click();
        webDriver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        webDriver.findElement(By.id("logout_sidebar_link")).click();
    }


    public boolean checkIfLoggedOut(){
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/");
    }





}
