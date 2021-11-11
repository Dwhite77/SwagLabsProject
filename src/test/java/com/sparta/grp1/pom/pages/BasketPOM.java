package com.sparta.grp1.pom.pages;

import com.sparta.grp1.cucumber.stepdefs.StepDefStateManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
//        System.out.println(w);
        webDriver.findElement(By.id("checkout")).click();
//        System.out.println(getPageURL());
//        return new COStepOnePOM(webDriver);
    }

    public void goToProductsPage(){
        webDriver.findElement(By.id("continue-shopping")).click();
//        return new ProductsPOM(webDriver);
    }

    private void addItemToBasket(){
        ProductsPOM productsPOM = new ProductsPOM(webDriver);
        goToProductsPage();
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        productsPOM.goToBasketPage();
    }

    public void goToItemPage(){
        String itemName;
        addItemToBasket();
        webDriver.findElement(By.id("item_4_title_link")).click();
    }



    // -------------------------------- Helper Methods ---------------------------

//    public boolean hasCheckoutPageLink(){
//        return goToCheckoutPage().equals("https://www.saucedemo.com/checkout-step-one.html");
//    }

//    public boolean hasProductPageLink(){
//        return goToProductsPage().getPageURL().equals("https://www.saucedemo.com/inventory.html");
//    }

}
