package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HtmlDropdownPrac {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        System.out.println("before method started");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/dropdown");

        System.out.println("before method ended");
    }

    @Test(priority = 1)
    public void htmlDropdown1Task() throws InterruptedException {

        WebElement dropdownlink = driver.findElement(By.xpath("/html//a[@id='dropdownMenuLink']"));

        dropdownlink.click();

        WebElement itemYahoo = driver.findElement(By.xpath("//a[@href='https://www.yahoo.com/']"));

        itemYahoo.click();

        driver.navigate().back();


        WebElement dropdownlink2 = driver.findElement(By.xpath("/html//a[@id='dropdownMenuLink']"));

        dropdownlink2.click();
        WebElement itemGoogle = driver.findElement(By.linkText("Google"));

        itemGoogle.click();



    }
        @AfterMethod
        public void teardownMethod(){
            driver.close();
        }




    }
