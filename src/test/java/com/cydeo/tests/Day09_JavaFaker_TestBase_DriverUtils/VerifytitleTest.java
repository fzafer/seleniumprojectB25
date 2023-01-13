package com.cydeo.tests.Day09_JavaFaker_TestBase_DriverUtils;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class VerifytitleTest extends TestBase {


    @Test
    public  void verifyTitle_test1 () {
        driver.get("https://www.google.com/");

        String expected = "Google";

        BrowserUtils.verifyTitle(driver, expected);
    }
}
