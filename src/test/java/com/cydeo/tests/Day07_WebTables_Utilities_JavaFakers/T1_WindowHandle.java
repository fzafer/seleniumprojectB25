package com.cydeo.tests.Day07_WebTables_Utilities_JavaFakers;

import com.cydeo.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_WindowHandle extends TestBase {

    @Test
    public void window_handling_test(){

        driver.get("https://www.amazon.com");

        ((JavascriptExecutor) driver). executeScript("window.open('https://google.com', '_blank');");
        ((JavascriptExecutor) driver). executeScript("window.open('https://etsy.com', '_blank');");
        ((JavascriptExecutor) driver). executeScript("window.open('https://facebook.com', '_blank');");

        // create a logic to switch the tab where etsy.com
        Set<String>allWindowsHandles = driver.getWindowHandles();

        // Assert: title contains  etsy
        for (String each :allWindowsHandles){
            driver.switchTo().window(each);
            System.out.println("current url: " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("etsy")){
                break;
            }
        }

        String actualtitle = driver.getTitle();
        String expectedIntitle = "Etsy";

        Assert.assertTrue(actualtitle.contains(expectedIntitle));






    }
}
