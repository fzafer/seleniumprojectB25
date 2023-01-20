package com.cydeo.tests.Day08_Properties_ConfigurationReader;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SmartbearTask {

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        BrowserUtils.sleep(2);
    }

    @Test
    public void Smartbear_test1(){
        //3. Enter username: “Tester”

        Xpath.xpath("//form[@id='aspnetForm']//input[@name='ctl00$MainContent$username']").sendKeys("Tester");

        //4. Enter password: “test”
        Xpath.xpath("//form[@id='aspnetForm']//input[@name='ctl00$MainContent$password']").sendKeys("test");

        //5. Click to Login button
        Xpath.xpath("//form[@id='aspnetForm']//input[@name='ctl00$MainContent$login_button']").click();

        //6. Print out count of all the links on landing page
      //  String url="";
        List<WebElement> allURLs = Driver.getDriver().findElements(By.tagName("a"));
        System.out.println("Total links on the Web Page: " + allURLs.size());


        //7. Print out each link text on this page
        for (WebElement eachUrl : allURLs) {
            System.out.println(eachUrl.getText());
        }







    }






}
