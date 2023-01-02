package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultiDropdow {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        System.out.println("before method started");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/dropdown");

        System.out.println("before method ended");
    }

    @Test(priority = 1)
    public void multiDropdown1Task() {

        System.out.println("Test1 started");
        WebElement multiDropdown = driver.findElement(By.xpath("//select[@name='Languages']"));

        Select selectMultiDropdownObj = new Select(multiDropdown);

       //check if this element has multiselect option
        System.out.println("selectMultiDropdownObj.isMultiple() = " + selectMultiDropdownObj.isMultiple());

        selectMultiDropdownObj.selectByIndex(0);
        selectMultiDropdownObj.selectByIndex(2);
        selectMultiDropdownObj.selectByValue("js");
        selectMultiDropdownObj.selectByVisibleText("Python");


        //deselect
        selectMultiDropdownObj.deselectByIndex(2);
        selectMultiDropdownObj.deselectByValue("js");
        selectMultiDropdownObj.deselectByVisibleText("Python");










    }
}