package com.cydeo.tests.Day09_JavaFaker_TestBase_DriverUtils;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class PropertiesPrac {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com");

    }


    @Test
    public void google_search_test(){

        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));

       // googleSearchBox.sendKeys("apple" + Keys.ENTER);
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        String expectedtitle = ConfigurationReader.getProperty("searchValue")+ " - Google'da Ara";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedtitle);

    }


}
