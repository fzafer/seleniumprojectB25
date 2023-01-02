package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class denemeDosyaAcma extends TestBase {

    @Test
    public void jjnjrv(){

        driver.get("file:///C:/Users/Administrator/Desktop/amanda%20clips/");
        WebElement troubled = driver.findElement(By.linkText("Amanda Tenfjord - -Troubled water- (P3aksjonen 2019).mp4"));
        troubled.click();
    }
}
