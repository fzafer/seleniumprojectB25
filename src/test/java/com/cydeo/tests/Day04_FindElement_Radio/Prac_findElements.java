package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Prac_findElements {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");
        Thread.sleep(1000);

        List<WebElement> allcolors = driver.findElements(By.xpath("//input[@name='color']"));
        System.out.println("allcolors.size() = " + allcolors.size());

        for (WebElement eachColor : allcolors) {
            System.out.println("Current radio button is " + eachColor.getAttribute("id"));
            System.out.println("Is it enabled " + eachColor.isEnabled());
            System.out.println("Is it selected " + eachColor.isSelected());

        }




        driver.close();
    }
}
