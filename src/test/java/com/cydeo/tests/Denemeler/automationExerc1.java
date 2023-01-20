package com.cydeo.tests.Denemeler;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class automationExerc1 extends TestBase {


    @Test
    public void test1(){


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        System.out.println(driver.getTitle());

        //4. Click on 'Signup / Login' button
     //   WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
     //   loginButton.click();

        BrowserUtils.sleep(3);

        WebElement loginButton = driver.findElement(By.xpath("//a[@href='/products']"));
        loginButton.click();
        ///html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/products']

        Alert alert = (Alert) driver.switchTo().alert();
        alert.dismiss();
        //5. Verify 'Login to your account' is visible
        WebElement loginText = driver.findElement(By.xpath("(//h2)[1]"));
        System.out.println("loginText.getText() = " + loginText.getText());

        Assert.assertEquals(loginText.getText(), "Login to your account");

        //6. Enter incorrect email address and password
        //7. Click 'login' button
        //8. Verify error 'Your email or password is incorrect!' is visible


    }

}
