package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactorySwitch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Alert2 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactorySwitch.getDriver("chrome");
    }

    @Test
    public void alertTest(){


        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        WebElement jsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        jsAlert.click();

        Alert alert = (Alert) driver.switchTo().alert();

        alert.accept();

        WebElement resultText = driver.findElement(By.id("result"));
        assertTrue(resultText.isDisplayed());




    }

}
