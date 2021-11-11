package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPOM extends AbstractPOM{

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
        setWebDriver(webDriver);
        goToLoginPage();
    }

    public void goToLoginPage(){
        getWebDriver().get("https://www.saucedemo.com/");
    }

    public ProductsPOM loginToProductsPage(userName userName){
        getWebDriver().findElement(By.id("user-name")).sendKeys(getUserName(userName)); //may need to press login button instead
        getWebDriver().findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
        return new ProductsPOM(getWebDriver());

    }

    public boolean loginSuccessful(){
        return getWebDriver().getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }

    public boolean lockedOutMessage(){
        String lockedMessage = getWebDriver().findElement(By.className("error-button")).getText();
        return lockedMessage.contains("locked out");
    }

    public boolean invalidLogin(){
        getWebDriver().findElement(By.id("user-name")).sendKeys("random"); //may need to press login button instead
        getWebDriver().findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
        return getWebDriver().getCurrentUrl().equals("https://www.saucedemo.com/");
    }

    public boolean invalidLoginMessage(){
        String lockedMessage = getWebDriver().findElement(By.className("error-button")).getText();
        return lockedMessage.contains("do not match any user");
    }

    public boolean noUsernameLogin(){
        getWebDriver().findElement(By.id("user-name")).sendKeys(""); //may need to press login button instead
        getWebDriver().findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
        return getWebDriver().getCurrentUrl().equals("https://www.saucedemo.com/");
    }

    public boolean noPasswordLogin(){
        getWebDriver().findElement(By.id("user-name")).sendKeys("test"); //may need to press login button instead
        getWebDriver().findElement(By.id("password")).sendKeys("", Keys.ENTER);
        return getWebDriver().getCurrentUrl().equals("https://www.saucedemo.com/");
    }


    public boolean invalidLoginMessageUsername(){
        String lockedMessage = getWebDriver().findElement(By.className("error-button")).getText();
        return lockedMessage.contains("Username is required");
    }

    public boolean invalidLoginMessagePassword(){
        String lockedMessage = getWebDriver().findElement(By.className("error-button")).getText();
        return lockedMessage.contains("Password is required");
    }


}
