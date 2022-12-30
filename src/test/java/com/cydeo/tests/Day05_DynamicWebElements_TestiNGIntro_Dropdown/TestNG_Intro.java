package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @BeforeClass
    public void setupMethod(){
        System.out.println("--> before class is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--> after class is running");
    }

    @BeforeMethod
    public void setupMethod2(){
        System.out.println(" --> before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> after method is running");
    }



    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");
        //ASSERT EQUALS compare 2 same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals (actual, expected);

    }



    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running...");

        //ASSERT TRUE
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue (actual.equals(expected));


    }


}
