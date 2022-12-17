package com.cydeo.tests.day2_locators_getTest_attribution.T1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoVerifications {

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");


        //3. Verify URL contains
        //Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println( "URL verification passed");
        } else{
            System.out.println( "URL verification FAILED");
        }


        //4. Verify title:
        //Expected: Practice
        String expectedtitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedtitle)){
            System.out.println("title verification PASSED!");
        }else{
            System.out.println("title verification FAILED!!!");
        }

        driver.close();

        


    }
}
