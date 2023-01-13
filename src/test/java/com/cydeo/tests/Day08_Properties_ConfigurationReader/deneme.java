package com.cydeo.tests.Day08_Properties_ConfigurationReader;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class deneme extends TestBase {


    @Test
    public void deneme(){
        driver.get("https://login.nextbasecrm.com/");

        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
    }





}
