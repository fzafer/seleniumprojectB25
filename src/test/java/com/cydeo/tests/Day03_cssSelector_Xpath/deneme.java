package com.cydeo.tests.Day03_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class deneme {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
    }
}
