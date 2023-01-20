package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath {

    public static WebElement xpath(String path){

        WebElement  webElement = Driver.getDriver().findElement(By.xpath(path));

        return webElement;
    }



}
