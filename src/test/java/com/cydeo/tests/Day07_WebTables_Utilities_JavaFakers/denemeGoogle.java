package com.cydeo.tests.Day07_WebTables_Utilities_JavaFakers;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class denemeGoogle extends TestBase {

    @Test
    public void googleSearchTest(){
        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("beymen" + Keys.ENTER);


        WebElement link = driver.findElement(By.xpath("//h3[.=.]"));
        link.click();
    }
}
