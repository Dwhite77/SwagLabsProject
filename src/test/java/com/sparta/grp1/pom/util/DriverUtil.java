package com.sparta.grp1.pom.util;

import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

public class DriverUtil {
    public static void setDriverLocation(String pathToDriver){
        System.setProperty("webDriver.chrome.driver", pathToDriver);
    }

    public static ChromeDriverService getChromeDriverService(String pathToDriver){
        return new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(pathToDriver))
                .usingAnyFreePort()
                .build();
    }
}
