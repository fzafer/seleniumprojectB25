package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_xpath_multipleButtons {

    public static void main(String[] args) {


        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        button1.click();


        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        WebElement clickedButtonText = driver.findElement(By.xpath("//p[@id='result']"));

        String expected = "Clicked on button one!";
        String actual = clickedButtonText.getText();

        System.out.println("actual = " + actual);

        if (expected.equals(actual)){
            System.out.println("Button1 verification PASSED!");
        }else{
            System.out.println("Button1 verification FAILED!");
        }



        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
