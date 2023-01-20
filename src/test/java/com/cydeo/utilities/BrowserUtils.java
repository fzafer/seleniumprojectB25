package com.cydeo.utilities;

/*
In this class only general utility methods that
are not related to some spec page
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    this meth will accept int seconds and execute thread sleep
     */

    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    /*
    this method accepts 3 args
         */
    public static void switchToWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedIntitle){
        Set<String> allWindowsHandles = driver.getWindowHandles();

        // Assert: title contains  etsy
        for (String each :allWindowsHandles){
            driver.switchTo().window(each);
            System.out.println("current url: " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualtitle = driver.getTitle();

        Assert.assertTrue(actualtitle.contains(expectedIntitle));

    }

    /*
    this method accepts a string expectedtitle and asserts if it is true
         */

    public static void verifyTitle (WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }




}
