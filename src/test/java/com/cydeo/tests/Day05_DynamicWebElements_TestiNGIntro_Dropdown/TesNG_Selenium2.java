package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TesNG_Selenium2 {

   // Methodun içinde olmayan diğer metotlarda bunu göremiyor
    //o yüzden classs içine taşıdık
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDown(){

        driver.quit();

    }

    @Test
    public void googleTitle(){
        driver.get("http://google.com");
    String expectedTitle = "Google";
    String actual = driver.getTitle();


      // true değilse verilecek uyarı
    Assert.assertEquals(actual, expectedTitle, "Google title is not matching");


    }


}
