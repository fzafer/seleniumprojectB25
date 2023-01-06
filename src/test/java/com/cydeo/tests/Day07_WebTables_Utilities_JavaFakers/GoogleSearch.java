package com.cydeo.tests.Day07_WebTables_Utilities_JavaFakers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearch {

    public static WebDriver searchGoogle(String browserType, String searchWord) {
        WebDriver driver = null;
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://google.com");
            WebElement searcBox = driver.findElement(By.name("q"));
            searcBox.sendKeys(searchWord + Keys.ENTER);
            List<WebElement> links = driver.findElements(By.tagName("a"));
            for (WebElement each : links) {
                if (each.getText().contains(searchWord)) {
                    each.click();
                    break;
                }
            }
        }
        return driver;

    }}

