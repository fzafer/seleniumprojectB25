package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactorySwitch {

    public static WebDriver getDriver(String browserName){
        WebDriver driver;

        switch (browserName.toLowerCase()){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new ChromeDriver();
                break;

            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new ChromeDriver();
                break;

            default:
                System.out.println("Unknown browser type: " + browserName);
                driver = null;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        return driver;
    }
}
