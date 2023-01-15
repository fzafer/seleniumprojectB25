package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown3 extends TestBase {


    @Test
    public void dropdown_test1(){

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));

        Select dropSelectObj = new Select(dropdown);

        System.out.println("dropSelectObj.getFirstSelectedOption().getText() = " + dropSelectObj.getFirstSelectedOption().getText());

        String expected = "Please select an option";
        String actual = dropSelectObj.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);

    }






}
