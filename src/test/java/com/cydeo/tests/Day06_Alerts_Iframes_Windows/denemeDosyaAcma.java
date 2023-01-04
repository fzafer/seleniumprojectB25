package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class denemeDosyaAcma  {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("File:D:\\YAZILIM\\JAVA\\Java Programming B25\\Day45 OOP Abstraction Continue Interface");
        WebElement troubled = driver.findElement(By.linkText("Day45 - OOP Abstraction Continue Interface.mp4"));
        troubled.click();
    }
}
