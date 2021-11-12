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

    public void addItemToBasket(int itemId){
        ProductsPOM productsPOM = new ProductsPOM(webDriver);
        goToProductsPage();
        webDriver.findElement(By.id("add-to-cart" + ProductsPOM.getAllProducts().get(itemId).getHyphenSeparatedName())).click();
        productsPOM.goToBasketPage();
    }

    public String lookForBasketInItem(int itemId){
        return webDriver.findElement(By.id(ProductsPOM.getAllProducts().get(itemId).getId())).getText();
    }

    public void removeBasketItem(int itemId){
        webDriver.findElement(By.id("remove" + ProductsPOM.getAllProducts().get(itemId).getHyphenSeparatedName())).click();
    }

    public void goToItemPage(int itemId){
        addItemToBasket(itemId);
        webDriver.findElement(By.id(ProductsPOM.getAllProducts().get(itemId).getId())).click();
    }

    public int numberOfItemsInBasket(){
        List<WebElement> webElementList = webDriver.findElements(By.id("cart_list"));
        return webElementList.size();
    }

}
