package com.cydeo.tests.Day08_Properties_ConfigurationReader;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables_Prac3 {


    @Test
    public void order_name_verify_test1() {

        Driver.getDriver().get("http://practice.cybertekschool.com/web-tables");
// xpath için metod oluşturdum
        WebElement element = Xpath.xpath("/html//div[@id='content']//form/table/tbody/tr/td[2]//table[@class='SampleTable']//td[.='Ned Stark']");
        System.out.println("element.getText() = " + element.getText());

        System.out.println("zz " + Xpath.xpath("/html//div[@id='content']//form/table/tbody/tr/td[2]//table[@class='SampleTable']//td[.='Ned Stark']").getText());
//buraya kadar

        WebElement nedCell = Driver.getDriver().findElement(By.xpath("/html//div[@id='content']//form/table/tbody/tr/td[2]//table[@class='SampleTable']//td[.='Ned Stark']"));

        System.out.println("nedCell.getText() = " + nedCell.getText());

        WebElement nedCellDate = Driver.getDriver().findElement(By.xpath("/html//div[@id='content']//form/table/tbody/tr/td[2]//table[@class='SampleTable']//td[.='Ned Stark']/following-sibling::td[3]"));
        System.out.println("nedCellDate = " + nedCellDate.getText());

        List<WebElement> allRow3Cells = Driver.getDriver().findElements(By.xpath("/html//div[@id='content']//form/table/tbody/tr/td[2]//table[@class='SampleTable']//td[3]"));

        System.out.println(allRow3Cells);
        for (WebElement each : allRow3Cells) {
            System.out.println(each.getText());

        }
    }

}
