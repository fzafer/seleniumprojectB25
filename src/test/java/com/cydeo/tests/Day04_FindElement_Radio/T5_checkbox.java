package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_checkbox {

    public static void main(String[] args) {


        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/checkboxes");

        // We have to locate checkboxes
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2]"));

        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.isselected " + checkBox1.isSelected());


        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isselected " + checkBox2.isSelected());


        //4. Click checkbox #1 to select it.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        checkBox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.
    }
}
