package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC4_FindElements {

    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement>allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println(allLinks.size());

        //5- Print out the texts of the links.
                //6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("Text: " + each.getText());
            System.out.println("HREF values: " + each.getAttribute("href"));
        }
    }
}