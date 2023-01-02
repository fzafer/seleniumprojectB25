package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class TestNGIntro2 {

    @BeforeClass
    public void setup(){
        System.out.println("before class");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("before method");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 running");
        assertEquals(5+1,6);
    }

    @Test
    public void test2(){
        System.out.println("Test 2 running");
        assertEquals(5+2,7);
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("after method");
    }
    @AfterClass
    public void teardown(){
        System.out.println("after class");
    }



}
