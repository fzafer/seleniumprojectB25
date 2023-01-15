package com.cydeo.tests.Day11_DriverClose_Actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Xpath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test
    public void scroll_test1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        WebElement poweredByText = Xpath.xpath("//div[@id='page-footer']/div/div");
        WebElement homeLink = Xpath.xpath("//nav/ul[@class='navbar-nav']//a[@href='/']");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(2);
        //scroll down to poweredBy
        js.executeScript("arguments[0].scrollIntoView(true)", poweredByText);
        //


        BrowserUtils.sleep(2);

        //scroll to home link
        js.executeScript("arguments[1].scrollIntoView(true)", poweredByText, homeLink);
        //js.executeScript("arguments[0].scrollIntoView(true)", homeLink);  //the same

        //arguments[0]: poweredByText
        //arguments[1]: homeLink





    }
}
