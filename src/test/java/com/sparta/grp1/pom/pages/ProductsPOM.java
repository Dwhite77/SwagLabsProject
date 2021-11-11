package com.sparta.grp1.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductsPOM extends AbstractPOM{

    public enum ORDERVALUES{
        AZ, ZA, LOHI, HILO
    }



//    public Keys getOrderValues(ORDERVALUES endingOrdering, ORDERVALUES startingOrdering){
//        Keys keys;
//        switch (startingOrdering){
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

    public void getOrder(){
        //224,212 0
        //853,212 1
        //224,464 2
        //853,464 3
        //224,717 4
        //853,717 5

        ArrayList<Point> points = new ArrayList<>();
        points.add(getPoints(0));
        points.add(getPoints(1));
        points.add(getPoints(2));
        points.add(getPoints(3));
        points.add(getPoints(4));
        points.add(getPoints(5));
        System.out.println(points.get(0).toString());

        for(Point x : points){
            System.out.println(x.toString());
            if(x.toString().equals("(224, 212)")){
                System.out.println("position 0");
            }
            else System.out.println("not position 0");
        }

    }

    public Point getPoints(int num){
        return getWebDriver().findElement(By.id("item_"+num+"_title_link")).getLocation();
    }


    // order for a-z 401523
    // order for z-a 325104
    // order for l-h 201345
    // order for h-l 543102

}
