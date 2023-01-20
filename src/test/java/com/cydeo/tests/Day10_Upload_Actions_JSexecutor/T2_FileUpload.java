package com.cydeo.tests.Day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_FileUpload {

    @Test
    public void fileUploadTest(){

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        //upload button locate edip send keys ile dosya pathini yapıştırıyoruz
        String path = "C:\\Users\\Administrator\\Desktop\\mat defter2\\1.jpg";

        WebElement selectFileButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        BrowserUtils.sleep(2);
        selectFileButton.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        uploadButton.click();

        Assert.assertTrue(Driver.getDriver().getTitle().contains("File Uploaded!"));
        ////div[@id='content']//h3[.='File Uploaded!']


    }



}
