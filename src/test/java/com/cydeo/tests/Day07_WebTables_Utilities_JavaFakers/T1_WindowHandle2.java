package com.cydeo.tests.Day07_WebTables_Utilities_JavaFakers;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T1_WindowHandle2 extends TestBase {

    @Test
    public void window_handling_test(){

        driver.get("https://www.amazon.com");

        ((JavascriptExecutor) driver). executeScript("window.open('https://google.com', '_blank');");
        ((JavascriptExecutor) driver). executeScript("window.open('https://etsy.com', '_blank');");
        ((JavascriptExecutor) driver). executeScript("window.open('https://facebook.com', '_blank');");


        // Assert: title contains  etsy
        BrowserUtils.switchToWindowAndVerify(driver, "etsy","Etsy" ) ;



    }
}
