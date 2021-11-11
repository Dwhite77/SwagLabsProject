package com.sparta.grp1.pom.pages;

import com.sparta.grp1.cucumber.stepdefs.StepDefStateManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPOM extends StepDefStateManager {
    private WebDriver webDriver;

    public BasketPOM(WebDriver webDriver){
        this.webDriver = webDriver;
        goToBasketPage();
    }

    public void goToBasketPage(){
        getWebDriver().get("https://www.saucedemo.com/cart.html");
    }

    public COStepOnePOM goToCheckoutPage() {
        getWebDriver().findElement(By.id("checkout")).click();
        return new COStepOnePOM(getWebDriver());
    }

    public ProductsPOM goToProductsPage(){
        getWebDriver().findElement(By.id("continue-shopping")).click();
        return new ProductsPOM(getWebDriver());
    }

    private void addItemToBasket(){
        ProductsPOM productsPOM = new ProductsPOM(getWebDriver());
        getWebDriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

    }

    public ProductInfoPOM goToItemPage(){
        String itemName;
        getWebDriver().findElement(By.id("item_4_title_link")).click();
        return new ProductInfoPOM(getWebDriver());
    }



    // -------------------------------- Helper Methods ---------------------------

    public boolean hasCheckoutPageLink(){
        return goToCheckoutPage().getPageURL().equals("https://www.saucedemo.com/cart.html");
    }

    public boolean hasProductPageLink(){
        return goToProductsPage().getPageURL().equals("https://www.saucedemo.com/inventory.html");
    }

}
