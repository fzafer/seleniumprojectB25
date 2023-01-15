package com.cydeo.tests.Day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverPrac2 {

    @Test
    public void hover_test1(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));


        WebElement img1Text = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement img2Text = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement img3Text = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        System.out.println(img2Text.isDisplayed());

        BrowserUtils.sleep(2);
        //hover to the first image with mouse
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(img2).perform();
        System.out.println(img2Text.isDisplayed());


    }





}
