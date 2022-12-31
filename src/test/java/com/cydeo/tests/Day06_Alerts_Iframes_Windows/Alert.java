package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #1: Information alert practice
        // 1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void alert_Test1() throws InterruptedException {

        //3. Click to “Click for JS Alert” button
        WebElement informationButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationButton.click();

        Alert alert = (Alert) driver.switchTo().alert();

        //4. Click to OK button from the alert
       // alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[id='result']"));

        String expected = "You succesfully clicked on alert";
        String actual = resultText.getText();

        Assert.assertEquals(actual, expected, "Actual text is not as expected");






    }


}
 /*
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.sendKeys(éHello);
        */