package com.cydeo.tests.Day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JSexecutor_Prac {

    @Test
    public void jsexecuter_test1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        // ((JavascriptExecutor)Driver.getDriver()).executeScript("");

      JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //750 pixels down 10 times
        //                x y
        //window.scrollBy(0,0)

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");

        }


        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");

        }

    }
}
