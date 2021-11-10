package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPOM extends AbstractPOM{

    public enum ORDERVALUES{
        AZ, ZA, LOHI, HILO
    }

//    public
//
//    public Keys getOrderValues(ORDERVALUES values, ORDERVALUES startingvalue){
//        Keys keys;
//        switch (startingvalue){
//            case AZ:
//
//            case ZA:
//
//            case HILO:
//
//            case LOHI:
//
//
//        }
//    }

    public ProductsPOM(WebDriver webDriver){
        setWebDriver(webDriver);
    }

//    public BasketPOM goToBasketPage(){
//        getWebDriver().findElement(By.cssSelector(".shopping_cart_link")).click();
//        return new BasketPOM(getWebDriver());
//    }

    public void openDropDown(){
        getWebDriver().findElement(By.className("product_sort_container")).click();
    }

    public void clickName(){ // this needs changed
        getWebDriver().findElement(By.className("product_sort_container")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }




}
