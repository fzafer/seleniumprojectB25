package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.utilities.WebDriverFactorySwitch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPrac2 {


WebDriver driver;
    @BeforeMethod
    public void setupMethod() {

        System.out.println("before method started");
        driver = WebDriverFactorySwitch.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/dropdown");

        System.out.println("before method ended");
    }

    @Test (priority = 1)
        public void dropdown1Task() {

        System.out.println("Test1 started");
        //identify the select elemen
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        //wrap this element inside select object
        Select selectObj = new Select(dropdown);

        //use ready methods to select option
        selectObj.selectByIndex(2);
        selectObj.selectByValue("2");
        selectObj.selectByVisibleText("Option 2");

        //verify determined opt is selecte
        String expected = "Option 2";
        String actual = selectObj.getFirstSelectedOption().getText();

        Assert.assertEquals(expected, actual);


        System.out.println("Test1 completed");
/*
    }


    @Test (priority = 2)
    public void dropdownTest2() {
*/
        System.out.println("Test2 started");
        WebElement dropdownDate = driver.findElement(By.xpath("/html//select[@id='year']"));

        Select selectYear = new Select(dropdownDate);

        selectYear.selectByVisibleText("2022");
        String expecterYear = "2022";
        String actualYear = selectYear.getFirstSelectedOption().getText();

        System.out.println(actualYear);

        Assert.assertEquals(actualYear, expecterYear);

        System.out.println("Test drop year completed");
  /*
    }
        @Test (priority = 2)
        public void dropdownTest3(){
*/
            System.out.println("Test3 started");

            System.out.println("------");

        WebElement dropMonth = driver.findElement(By.xpath("/html//select[@id='month']"));

        Select selectMonth = new Select(dropMonth);

        selectMonth.selectByValue("3");

        String expectedMonth = "April";
        String actualMonth = selectMonth.getFirstSelectedOption().getText();

        System.out.println(actualMonth);

        Assert.assertEquals(actualMonth,expectedMonth);

        System.out.println("Test drop month completed");

        System.out.println("Test day started");

        WebElement dropDay = driver.findElement(By.xpath("//select[@id='day']"));

        Select selectDayObj = new Select(dropDay);

        selectDayObj.selectByIndex(5);

        String expectedDay = "6";
        String actualDay = selectDayObj.getFirstSelectedOption().getText();

        System.out.println(actualDay);

        Assert.assertEquals(actualDay,expectedDay);

        System.out.println("Test day completed");

    }





    @AfterMethod
    public void test1Completed() {
        System.out.println("after method completed");
    }




    }

