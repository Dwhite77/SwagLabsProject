package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.*;

public class LogoutPOM {

    private WebDriver webDriver;

    public LogoutPOM(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public boolean loggedOut(){
        webDriver.findElement(By.id("react-burger-menu-btn")).click();
        webDriver.findElement(By.id("logout_sidebar_link")).click();
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/");
    }



}
