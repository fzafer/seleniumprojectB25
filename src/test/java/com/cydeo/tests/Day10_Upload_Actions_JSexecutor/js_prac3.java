package com.cydeo.tests.Day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Xpath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class js_prac3 {

    @Test
    public void jsexecuter_test1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/");

        WebElement element = Xpath.xpath("//div[@id='content']/ul[@class='list-group']//a[@href='/web-tables']");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(3);

        //burada scroll edip elementi bulunca duruyor:
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        BrowserUtils.sleep(3);

        //click ekleyebiliriz
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()",element);
        BrowserUtils.sleep(3);



    }
}
