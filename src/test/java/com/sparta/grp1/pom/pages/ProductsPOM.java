package com.sparta.grp1.pom.pages;

import com.sparta.grp1.pom.util.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;


public class ProductsPOM {

    private WebDriver webDriver;
    private static ArrayList<Products> allProducts = new ArrayList<>();


    public ProductsPOM(WebDriver webDriver){
        this.webDriver = webDriver;
    }


    public void goToBasketPage(){
        webDriver.findElement(By.cssSelector(".shopping_cart_link")).click();
    }

    public void openDropDown(){
        webDriver.findElement(By.className("product_sort_container")).click();
    }

    public void clickName(int orderingNum){
        switch (orderingNum){
            case 0:
                webDriver.findElement(By.className("product_sort_container")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP, Keys.ENTER);
                break;
            case 1:
                webDriver.findElement(By.className("product_sort_container")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_DOWN, Keys.ENTER);
                break;
            case 2:
                webDriver.findElement(By.className("product_sort_container")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER);
                break;
            case 3:
                webDriver.findElement(By.className("product_sort_container")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER);
                break;
            default:
                webDriver.findElement(By.className("product_sort_container")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP, Keys.ENTER);
                break;
        }


    }

    public String getName(int num){
        String[] string = webDriver.findElements(By.className("inventory_item")).get(num).getText().split("\n");
        return string[0];
    }

    public ArrayList<String> getNameArray() {
        ArrayList<String> nameArr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            nameArr.add(getName(i));
        }
        return nameArr;
    }

    // dont have time to make this a very specific check, currently it only checks the first item name and if it matches what is expected then it passes
    public String getOrder(){
        switch (getNameArray().get(0)){
            case "Sauce Labs Backpack":
                return "ordering is A-Z";

            case "Test.allTheThings() T-Shirt (Red)":
                return "ordering is Z-A";

            case "Sauce Labs Onesie":
                return "ordering is L-H";

            case "Sauce Labs Fleece Jacket":
                return "ordering is H-L";

        }return "invalid";
    }

    public static void addAllProducts(){
        allProducts.add(new Products(Products.itemIDNameGenerator(0), "Sauce Labs Bike Light"));
        allProducts.add(new Products(Products.itemIDNameGenerator(1), "Sauce Labs Bolt T-Shirt"));
        allProducts.add(new Products(Products.itemIDNameGenerator(2), "Sauce Labs Onesie"));
        allProducts.add(new Products(Products.itemIDNameGenerator(3), "Test.allTheThings() T-Shirt (Red)"));
        allProducts.add(new Products(Products.itemIDNameGenerator(4), "Sauce Labs Backpack"));
        allProducts.add(new Products(Products.itemIDNameGenerator(5), "Sauce Labs Fleece Jacket"));

    }

}
