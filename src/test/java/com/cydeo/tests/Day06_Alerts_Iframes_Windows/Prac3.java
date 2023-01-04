package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Prac3 extends TestBase {

    @Test
    public void DropdownPrac(){
/*
        driver.get("http://practice.cybertekschool.com/");
        WebElement dropdownLink = driver.findElement(By.xpath("//div[@id='content']/ul[@class='list-group']//a[@href='/dropdown']"));
        dropdownLink.click();

        Select ddSimple = new Select(driver.findElement(By.xpath("/html//select[@id='dropdown']")));
        ddSimple.selectByVisibleText("Option 1");

        String expected = "Option 1";
        String actual = ddSimple.getFirstSelectedOption().getText();

        Assert.assertEquals(actual,expected);


        ddSimple.selectByIndex(2);

        String expected2 = "Option 1";
        String actual2 = ddSimple.getFirstSelectedOption().getText();

        Assert.assertEquals(actual2,expected2);

        */
        driver.get("https://www.imdb.com/");

        WebElement ddLanguage = driver.findElement(By.xpath("//nav[@id='imdbHeader']/div[@role='presentation']/div[6]/label[@role='button']/div[@class='ipc-button__text']"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

/*
        ddKategori.click();

        WebElement dizustu = driver.findElement(By.linkText("Dizüstü Bilgisayar"));
        dizustu.click();
*/

        Select selectDdLanguageObj = new Select(ddLanguage);
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        selectDdLanguageObj.selectByVisibleText("Deutsch (Deutschland)");

        driver.getTitle();






    }

}
