package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class COStepTwoPOM{
    private WebDriver webDriver;

    public COStepTwoPOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void goToStep2Page(){
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        webDriver.findElement(By.id("shopping_cart_container")).click();
        webDriver.findElement(By.id("checkout")).click();
        webDriver.findElement(By.id("first-name")).sendKeys("test");
        webDriver.findElement(By.id("last-name")).sendKeys("test");
        webDriver.findElement(By.id("postal-code")).sendKeys("test");
        webDriver.findElement(By.id("continue")).click();
    }

    public void clickFinish(){
        webDriver.findElement(By.id("finish")).click();
    }

    public boolean checkTotal(){
        return webDriver.findElement(By.className("summary_total_label")).getText().equals("Total: $32.39");
    }

    public boolean checkPaymentInfo(){
        return webDriver.findElements(By.className("summary_value_label")).get(0).getText().equals("SauceCard #31337");
    }

    public boolean checkShippingInfo(){
        return webDriver.findElements(By.className("summary_value_label")).get(1).getText().equals("FREE PONY EXPRESS DELIVERY!");
    }
    public void goToProductsPage(){
        webDriver.findElement(By.id("cancel")).click();
    }


}
