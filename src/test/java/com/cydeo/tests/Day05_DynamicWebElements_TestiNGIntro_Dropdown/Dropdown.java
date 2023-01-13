package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.utilities.WebDriverFactorySwitch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown {

    WebDriver driver;

    @BeforeMethod
            public void setupMethod() {

        WebDriver driver = WebDriverFactorySwitch.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/dropdown");

    }


    @Test
    public void simpleDropdownTest (){
      WebElement simpleDrowdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

      Select currentlySelectedOption = new Select(simpleDrowdown);

      currentlySelectedOption.selectByIndex(2);


      String actualSimpleDropdownText = currentlySelectedOption.getFirstSelectedOption().getText();
      String expectedSimpleDropdownText = "Please select an option";

        System.out.println(actualSimpleDropdownText);

     Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropdownText);

     //Verify state selection default selection value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //expected " select a state"
        String expected= "select a state";
        String actual = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual,expected);
        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "select a state");

    }


}
