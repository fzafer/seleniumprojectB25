package com.cydeo.utilities;

//TASK: NEW METHOD CREATION
// Static method
//Accepts String arg: Boroser type
//


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (browserType.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            return new  FirefoxDriver();
        }else{
            System.out.println("Given browser doesn't exist");
            System.out.println("Driver = null");
            return null;
        }

    }

}
