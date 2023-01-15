package com.cydeo.tests.Day07_WebTables_Utilities_JavaFakers;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandle3 {

    @Test
    public void windowHandle_test1(){

        Driver.getDriver().get("http://practice.cybertekschool.com");

        String currentHandler = Driver.getDriver().getWindowHandle();
        System.out.println("currentHandler = " + currentHandler);

        Set<String > allHandles = Driver.getDriver().getWindowHandles();
        System.out.println("allHandles = " + allHandles);

        WebElement clickButton = Driver.getDriver().findElement(By.linkText("New tab"));
        clickButton.click();

        BrowserUtils.sleep(3);
      System.out.println("Driver.getDriver().getWindowHandle() = " + Driver.getDriver().getWindowHandle());
      System.out.println("Driver.getDriver().getWindowHandles() = " + Driver.getDriver().getWindowHandles());

    }
}
