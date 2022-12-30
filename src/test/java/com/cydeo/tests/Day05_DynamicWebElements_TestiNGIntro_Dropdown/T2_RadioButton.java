package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RadioButton {

    public static void main(String[] args) {


    WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/radio_buttons/");


    WebElement radioButton = driver.findElement(By.xpath("//button[.='Add Element']"));



}
}
