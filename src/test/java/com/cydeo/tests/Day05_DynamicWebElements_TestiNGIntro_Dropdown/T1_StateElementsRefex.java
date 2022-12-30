package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StateElementsRefex {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");


        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));

        Thread.sleep(2000);
        addElementButton.click();

        WebElement deleteButton =
                driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        deleteButton.click();




    }}
