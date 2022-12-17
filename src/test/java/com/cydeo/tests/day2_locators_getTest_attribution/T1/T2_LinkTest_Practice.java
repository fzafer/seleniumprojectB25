package com.cydeo.tests.day2_locators_getTest_attribution.T1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTest_Practice {

    public static void main(String[] args) {

        //C #2: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo
        driver.get("https://practice.cydeo.com");

        // 3- Click to A/B Testing from top
        //Thread.sleep(2000);

       // driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        // bu şekilde store ettik

        abTestLink.click();

        //bu şekilde reusable oldu

        /*
        !!!!!
        O sayfaya gidip o linki sağ tıkla, Bu texti bul ve çift tıkla ve kopyala
         */


/*
yanlş yazarsak:
Exception in thread "main" org.openqa.selenium.
NoSuchElementException: no such element:
Unable to locate element: {"method":"link text","selector":"A/ Testing"}

ve en altta yeri belirtiyor:
	at com.cydeo.tests.day2_locators_getTest_attribution.
	T1.T2_LinkTest_Practice.main
	(T2_LinkTest_Practice.java:22)

 */
        // 4- Verify title is:
        //Expected: No A/B Test
        String expectedtitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedtitle)){
            System.out.println("title verification PASSED!");
        }else{
            System.out.println("title verification FAILED!!!");
        }






        // 5- Go back to home page by us
        driver.navigate().back();


        // 6- Verify title equals:
        //Expected: Practice
        String expectedtitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedtitle2)){
            System.out.println("title verification PASSED!");
        }else{
            System.out.println("title verification FAILED!!!");
        }
    }
}
