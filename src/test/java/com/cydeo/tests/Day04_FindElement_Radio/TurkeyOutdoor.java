package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class TurkeyOutdoor {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i <100 ; i++) {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("https://turkeyoutdoor.org/");
driver.close();
Thread.sleep(2000);
        }
          //
    }
}
