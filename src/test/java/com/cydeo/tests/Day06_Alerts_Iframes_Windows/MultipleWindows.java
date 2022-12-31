package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #5: Window Handle practice
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        //3. Go to: https://practice.cydeo.com/windows

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://practice.cydeo.com/windows");

    }

    //   @Ignore
    @Test
    public void window_Test1() {
    //4. Assert: Title is “Windows”
        //storing main page's window handle
        //good practice for future use
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        String expected= "Windows";
        String actual = driver.getTitle();

        Assert.assertEquals(actual, expected);

        System.out.println("actual title before click = " + actual);

        //5. Click to: “Click Here” link
        WebElement clickButton = driver.findElement(By.linkText("Click here"));
        clickButton.click();

        actual = driver.getTitle();

        System.out.println("actual title after click= " + actual);





        //6. Switch to new Window.



    //7. Assert: Title is “New Window”


    }
}

