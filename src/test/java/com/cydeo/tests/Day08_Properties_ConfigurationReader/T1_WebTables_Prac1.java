package com.cydeo.tests.Day08_Properties_ConfigurationReader;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WebTables_Prac1 extends TestBase {


    @Test
    public void order_name_verify_test1(){

        driver.get("http://practice.cybertekschool.com/web-tables");

        WebElement bobMartinCell= driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        String expected = "Bob Martin";
        String actual = bobMartinCell.getText();

        Assert.assertEquals(actual, expected);
        //verify bob martins name is listed as expected

        //expected: "Bob Martin"

        //verify its orders date as expected
        //bob marley's date 12/31/2021
        WebElement bobMdate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        System.out.println("bobMdate.getText() = " + bobMdate.getText());

        String expected2 = "12/31/2021";
        String actual2 = bobMdate.getText();
        Assert.assertEquals(actual2, expected2);
    }

    @Test
    public void order_date_verify_test2(){
        driver.get("http://practice.cybertekschool.com/web-tables");

        System.out.println(WebTableUtils.returnOrderDate(driver, "Alexandra Gray"));


}

    @Test
    public void order_date_verify_test3(){
        driver.get("http://practice.cybertekschool.com/web-tables");

        WebTableUtils.orderVerify(driver, "Alexandra Gray", "04/15/2021");


    }



}
