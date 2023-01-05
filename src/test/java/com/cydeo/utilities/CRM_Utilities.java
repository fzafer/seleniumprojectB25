package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    this method will login with helpdesk1
     */
    public static void  crm_login(WebDriver driver, String username, String password){


        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys(username);

        WebElement inputPassWord = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassWord.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        //helpdesk1@cybertekschool.com UserUser
        //helpdesk2@cybertekschool.com UserUser






    }}
