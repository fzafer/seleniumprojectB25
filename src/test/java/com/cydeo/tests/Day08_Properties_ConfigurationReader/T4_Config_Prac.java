package com.cydeo.tests.Day08_Properties_ConfigurationReader;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Prac extends TestBase {




    @Test
    public void google_search_test(){
        driver.get("http://google.com");
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("Apple" + Keys.ENTER);


        String expectedTitle = "Apple - Google'da Ara";
        String actual = driver.getTitle();

        Assert.assertEquals(actual, expectedTitle);




    }

}
