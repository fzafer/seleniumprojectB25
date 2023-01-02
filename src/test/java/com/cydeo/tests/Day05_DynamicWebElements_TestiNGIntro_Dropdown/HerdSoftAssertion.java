package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertTrue;

public class HerdSoftAssertion {

    @Test
    public void hardAssertion(){

        Assert.assertEquals("apple", "app");
        System.out.println("after assertion failed");
        assertTrue("orange".equals("oranger"));
    }

    @Test
    public void softAssertion(){

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple", "app");
        System.out.println("after assertion failed");
        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("after assertion failed");

        softAssert.assertAll();

    }
}
