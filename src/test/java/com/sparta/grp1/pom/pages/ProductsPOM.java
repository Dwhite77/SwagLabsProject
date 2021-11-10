package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPOM extends AbstractPOM{

    public enum ORDERVALUES{
        AZ, ZA, LOHI, HILO
    }

    public String getOrderValues(ORDERVALUES ordervalues){
        switch (ordervalues){
            case AZ:
                return "az";
            case ZA:
                return "za";
            case HILO:
                return "hilo";
            case LOHI:
                return "lohi";
            default:
                return "az";
        }
    }

    public ProductsPOM(WebDriver webDriver){
        setWebDriver(webDriver);
    }

    public BasketPOM goToBasketPage(){
        getWebDriver().findElement(By.cssSelector(".shopping_cart_link")).click();
        return new BasketPOM(getWebDriver());
    }

    public void openDropDown(){
        getWebDriver().findElement(By.className("product_sort_container")).click();
    }
    public void clickName(String value){
        Select dropdown = new Select(getWebDriver().findElement(By.className("product_sort_container")));
        dropdown.selectByValue(value);
    }



}
