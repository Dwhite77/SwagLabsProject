package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPOM extends AbstractPOM{

    private WebDriver webDriver;
    private By basketPage = new By.ById("shopping_cart_container");

    public enum userName{
        STANDARD_USER,LOCKED_OUT_USER,PROBLEM_USER,PERFORMANCE_GLITCH_USER
    }

    public String getUserName(userName user){
        switch(user){
            case STANDARD_USER:
                return "standard_user";
            case LOCKED_OUT_USER:
                return "locked_out_user";
            case PROBLEM_USER:
                return "problem_user";
            case PERFORMANCE_GLITCH_USER:
                return "performance_glitch_user";
            default:
                return "standard_user";
        }
    }

    public LoginPOM(WebDriver webDriver){
        this.webDriver = webDriver;
        goToLoginPage();
    }

    public void goToLoginPage(){
        webDriver.get("https://www.saucedemo.com/");
    }

    public ProductsPOM loginToProductsPage(userName userName){
        webDriver.findElement(By.id("user-name")).sendKeys(getUserName(userName)); //may need to press login button instead
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
        return new ProductsPOM(webDriver);
    }

    public boolean invalidLogin(){
        webDriver.findElement(By.id("user-name")).sendKeys("random"); //may need to press login button instead
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
        return webDriver.getCurrentUrl().equals("https://www.saucedemo.com/");
    }


}
