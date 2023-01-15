package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Iframes2 extends TestBase {

    @Test
    public void iframeTest(){

        driver.get("http://practice.cybertekschool.com/iframe");

      //  WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
      //  driver.switchTo().frame(iframe);

                            //index number
       // driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea = driver.findElement(By.tagName("p"));
        assertTrue(textArea.isDisplayed());

        driver.switchTo().parentFrame();


    }










}
