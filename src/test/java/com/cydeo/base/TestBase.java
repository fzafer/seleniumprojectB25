package com.cydeo.base;

import com.cydeo.utilities.WebDriverFactorySwitch;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver  = WebDriverFactorySwitch.getDriver("chrome");

      //  WebDriverManager.chromedriver().setup();
      //  driver = new ChromeDriver();
      //  driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDown(){

    //  driver.quit();

    }

}
