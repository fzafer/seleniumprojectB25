package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod2(){

        //do browser setup
        //open browser
        System.out.println(" --> before method is running");
      driver = WebDriverFactory.getDriver("chrome");

//maximize
        driver.manage().window().maximize();

    //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> after method is running");
        driver.close();
    }




    @Test
    public void selenium_test(){


        //get google.com
        driver.get("https://google.com");

        //assert: title is "Google"
        String expectedTitle= "Google";
        String actualTitle = driver.getTitle();


        Assert.assertEquals(driver.getTitle(), "Google");
        Assert.assertEquals(actualTitle, expectedTitle);



/*

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/radio_buttons/");
*/

    }











}
