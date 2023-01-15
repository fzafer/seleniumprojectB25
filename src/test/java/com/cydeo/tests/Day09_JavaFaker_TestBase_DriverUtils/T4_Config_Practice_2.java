package com.cydeo.tests.Day09_JavaFaker_TestBase_DriverUtils;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class T4_Config_Practice_2 {
  //  public WebDriver driver;
//
 //   @BeforeMethod
 //   public void setupMethod(){
  //      String browserType = ConfigurationReader.getProperty("browser");
  //      driver = WebDriverFactory.getDriver(browserType);
//
  //      driver.manage().window().maximize();
  //      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  //     driver.get("https://google.com");

  //  }




    @Test
    public void google_search_test(){

        Driver.getDriver().get("https://google.com");

        //driver yerine Driver.gettDriver() ekliyoruz
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

       // googleSearchBox.sendKeys("apple" + Keys.ENTER);
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        String expectedtitle = ConfigurationReader.getProperty("searchValue")+ " - Google'da Ara";

        //driver yerine Driver.gettDriver() ekliyoruz
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedtitle);

    }


}
