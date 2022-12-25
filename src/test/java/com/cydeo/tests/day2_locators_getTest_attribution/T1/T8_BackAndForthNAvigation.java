package com.cydeo.tests.day2_locators_getTest_attribution.T1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8_BackAndForthNAvigation {

    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification-1 PASSED!");
        }else{
            System.out.println("Title verification-1 FAILED!!!");
        }


        //5- Go back to Google by using the .back();
        driver.navigate().back();


        //6- Verify title equals:
        //Expected: Google
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification-2 PASSED!");
        }else{
            System.out.println("Title verification-2 FAILED!!!");
        }
    }
}
