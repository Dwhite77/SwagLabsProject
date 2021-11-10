package com.sparta.grp1.pom.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public enum Browsers{
        CHROME, FIREFOX, INTERNET_EXPLORER, SAFARI // don't use anything but chrome atm
    }

    public static WebDriver getWebDriver(Browsers name){
        WebDriver webDriver = null;
        switch (name){
            case CHROME:
                webDriver = new ChromeDriver();
                break;
            case FIREFOX:
                webDriver = new FirefoxDriver();
                break;
            case INTERNET_EXPLORER:
                webDriver = new InternetExplorerDriver();
                break;
            case SAFARI:
                webDriver = new SafariDriver();
                break;
        }return webDriver;
    }

    public static WebDriver getWebDriver(Browsers name, ChromeDriverService service, ChromeOptions options){
        WebDriver webDriver = null;
        switch (name){
            case CHROME:
                webDriver = new ChromeDriver(service,options);
                break;
            case FIREFOX:
                webDriver = new FirefoxDriver();
                break;
            case INTERNET_EXPLORER:
                webDriver = new InternetExplorerDriver();
                break;
            case SAFARI:
                webDriver = new SafariDriver();
                break;
        }return webDriver;
    }


    public static WebDriver getWebDriver(Browsers name, ChromeOptions options){
        WebDriver webDriver = null;
        switch (name){
            case CHROME:
                webDriver = new ChromeDriver(options);
                break;
            case FIREFOX:
                webDriver = new FirefoxDriver();
                break;
            case INTERNET_EXPLORER:
                webDriver = new InternetExplorerDriver();
                break;
            case SAFARI:
                webDriver = new SafariDriver();
                break;
        }return webDriver;
    }
}
