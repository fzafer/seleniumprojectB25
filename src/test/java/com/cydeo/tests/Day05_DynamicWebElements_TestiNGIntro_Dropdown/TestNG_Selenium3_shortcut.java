package com.cydeo.tests.Day05_DynamicWebElements_TestiNGIntro_Dropdown;

import com.cydeo.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Selenium3_shortcut extends TestBase {

   //before after methodları sildik
    //extends TestBase yazıyoruz


    @Test
    public void googleTitle(){
        driver.get("http://google.com");
        String expectedTitle = "Google";
        String actual = driver.getTitle();


        // true değilse verilecek uyarı
        Assert.assertEquals(actual, expectedTitle, "Google title is not matching");


    }}
