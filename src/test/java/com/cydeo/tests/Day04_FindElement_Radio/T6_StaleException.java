package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_StaleException {

    public static void main(String[] args) {


        //TC #6: StaleElementReferenceException Task
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed(): " + cydeoLink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();

        //refreshing and (bağlantıyı koparıp yeniden atıyoruz) re-assigning:
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));


        //5- Verify it is displayed, again.
        //This is a simple StaleElementReferenceException to understand what is
        //this exception and how to handle it.
    }
}
