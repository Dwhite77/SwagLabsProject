package com.sparta.grp1.pom.fragements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CopyrightTextPOM {
    private static WebDriver webDriver;

    public CopyrightTextPOM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static boolean hasCorrectYear(int year) {
        return webDriver.findElement(By.className("footer_copy"))
                .getText()
                .contains(String.valueOf(year));
    }
}
