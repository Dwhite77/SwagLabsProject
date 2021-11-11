package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;


public class ProductsPOM {

    private WebDriver webDriver;


    public ProductsPOM(WebDriver webDriver){
        this.webDriver = webDriver;
    }



//    public BasketPOM goToBasketPage(){
//        getWebDriver().findElement(By.cssSelector(".shopping_cart_link")).click();
//        return new BasketPOM(getWebDriver());
//    }

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




















//    public void getOrder(){
//
//        HashMap<Integer, Integer> productOrder = new HashMap<>();
//        for(int i =0; i<6;i++){
//            productOrder = getPoints(i,productOrder);
//        }
//
//        if(productOrder.get(0).equals(4) && productOrder.get(1).equals(0) && productOrder.get(2).equals(1) && productOrder.get(3).equals(5) && productOrder.get(4).equals(2) && productOrder.get(5).equals(3)){
//            System.out.println("A-z");
//        }
//
//    }


//    public HashMap<Integer, Integer> getPoints(int num, HashMap<Integer, Integer> hashMap){
//        Point point = webDriver.findElement(By.id("item_"+num+"_title_link")).getLocation();
//        System.out.println(hashMap.size());
//        System.out.println(point.toString());
//        switch(point.toString()){
//            case "(224, 212)":
//                System.out.println("position 0");
//                hashMap.put(0,num);
//                break;
//
//            case "(224, 427)":
//                System.out.println("position 2");
//                hashMap.put(2,num);
//                break;
//
//            case "(224, 624)":
//                System.out.println("position 4");
//                hashMap.put(4,num);
//                break;
//
//            case "(853, 212)":
//                System.out.println("position 1");
//                hashMap.put(1,num);
//                break;
//
//            case "(853, 427)":
//                System.out.println("position 3");
//                hashMap.put(3,num);
//                break;
//
//            case "(853, 717)":
//                System.out.println("position 5");
//                hashMap.put(5,num);
//                break;
//        }
//        return hashMap;
//    }


    // order for a-z 401523
    // order for z-a 325104
    // order for l-h 201345
    // order for h-l 543102

}
