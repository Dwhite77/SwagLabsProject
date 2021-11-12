package com.sparta.grp1.pom.pages;

import com.sparta.grp1.pom.util.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashMap;


public class ProductsPOM {

    private WebDriver webDriver;
    private static HashMap<Integer, Products> allProducts = new HashMap<>();

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
        allProducts.put(0, new Products(Products.itemIDNameGenerator(0), "Sauce Labs Bike Light"));
        allProducts.put(1, new Products(Products.itemIDNameGenerator(1), "Sauce Labs Bolt T-Shirt"));
        allProducts.put(2, new Products(Products.itemIDNameGenerator(2), "Sauce Labs Onesie"));
        allProducts.put(3, new Products(Products.itemIDNameGenerator(3), "Test.allTheThings() T-Shirt (Red)"));
        allProducts.put(4, new Products(Products.itemIDNameGenerator(4), "Sauce Labs Backpack"));
        allProducts.put(5, new Products(Products.itemIDNameGenerator(5), "Sauce Labs Fleece Jacket"));

    }

    public static HashMap<Integer, Products> getAllProducts() {
        return allProducts;
    }
}
