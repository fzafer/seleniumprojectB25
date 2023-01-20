package com.cydeo.tests.Day12_PageObjectModel_Synchronization;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_DynamicLoading {

    DynamicLoad7Page dynamicLoad7Page;

    @BeforeMethod
    public void setupMethod(){
        dynamicLoad7Page = new DynamicLoad7Page();

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

    }
    @Test
    public void dynamic_load7_test1(){

        //wait until dynamic title loads and verify it

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        //wait until condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //create dynamic page object to reach and assert
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());

        Driver.closeDriver();
    }

}
