package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Prac_RadioButton {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");
        Thread.sleep(1000);

       // WebElement radioButtonBlue = driver.findElement(By.xpath("//*[.='Blue']"));
        WebElement radioButtonBlue2 = driver.findElement(By.xpath("//input[@id='blue']"));

        WebElement radioButtonRed = driver.findElement(By.xpath("//input[@id='red']"));


      //  System.out.println("radioButtonBlue.isSelected() = " + radioButtonBlue.isSelected());
        System.out.println("radioButtonBlue2.isSelected() = " + radioButtonBlue2.isSelected());

        Thread.sleep(1000);
        radioButtonBlue2.click();
        Thread.sleep(1000);
        System.out.println("radioButtonBlue2.isSelected() = " + radioButtonBlue2.isSelected());

        System.out.println("radioButtonRed.isSelected() = " + radioButtonRed.isSelected());
        Thread.sleep(1000);
        radioButtonBlue2.click();
        Thread.sleep(1000);
        System.out.println("radioButtonRed.isSelected() = " + radioButtonRed.isSelected());

        driver.close();
        System.exit(0);
    }
}
