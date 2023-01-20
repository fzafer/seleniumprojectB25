package com.cydeo.tests.Denemeler;

import com.cydeo.pages.PracticeCydeo;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CydeoPagePrac1 {

    PracticeCydeo practiceCydeo;

    @BeforeMethod
    public void setupMethod(){
        practiceCydeo = new PracticeCydeo();

        Driver.getDriver().get("http://practice.cybertekschool.com");

    }
    @Test
    public void practice_test1(){

        //wait until dynamic title loads and verify it

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        //wait until condition
     //   wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //create dynamic page object to reach and assert
        PracticeCydeo practiceCydeo1 = new PracticeCydeo();

        practiceCydeo1.abTesting.click();
    }
}
