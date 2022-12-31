package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #4: Iframe practice
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        //3. Go to: https://practice.cydeo.com/iframe

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");

    }

  //   @Ignore
    @Test
    public void iframe_Test1(){
        //4. Assert: “Your content goes here.” Text is displayed.
        //we need to switch drviver's focus iframe
        //opt 1: switching to iframe using it attrib
        driver.switchTo().frame("mce_0_ifr");

        //opt2: passing index number of iframe
        //driver.switchTo().frame(0);

        //opt3: locate as webelement and pass in frame() method
      //  driver.switchTo().frame(driver.findElement(By.xpath(//iframe[@id='mce_0_ifr'])));

        //locate the p tag
        WebElement iframeText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(iframeText.isDisplayed());

    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        WebElement headerText = driver.findElement(By.xpath("//h3"));


        Assert.assertTrue(headerText.isDisplayed());



    }






}
