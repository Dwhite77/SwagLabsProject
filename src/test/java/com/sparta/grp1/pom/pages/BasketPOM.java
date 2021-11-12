package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPOM {
    private WebDriver webDriver;

    public BasketPOM(WebDriver webDriver){
        this.webDriver = webDriver;
        goToBasketPage();
    }

    public void goToBasketPage(){
        webDriver.get("https://www.saucedemo.com/cart.html");

    }

    public void goToCheckoutPage() {
        webDriver.findElement(By.id("checkout")).click();

    }

    public void goToProductsPage(){
        webDriver.findElement(By.id("continue-shopping")).click();
    }

    public void addItemToBasket(){
        ProductsPOM productsPOM = new ProductsPOM(webDriver);
        goToProductsPage();
        webDriver.findElement(By.id("add-to-cart" + ProductsPOM.getAllProducts().get(4).getHyphenSeparatedName())).click();
        productsPOM.goToBasketPage();
    }

    public String lookForBasketInItem(){
        return webDriver.findElement(By.id(ProductsPOM.getAllProducts().get(4).getId())).getText();
    }

    public void removeBasketItem(){
        webDriver.findElement(By.id("remove" + ProductsPOM.getAllProducts().get(4).getHyphenSeparatedName())).click();
    }

    public void goToItemPage(){
        addItemToBasket();
        webDriver.findElement(By.id(ProductsPOM.getAllProducts().get(4).getId())).click();
    }

    public int numberOfItemsInBasket(){
        List<WebElement> webElementList = webDriver.findElements(By.id("cart_list"));
        return webElementList.size();
    }

}
