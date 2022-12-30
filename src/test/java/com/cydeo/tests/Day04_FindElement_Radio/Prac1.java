package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Prac1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://app.vytrack.com/user/login");

        //enter user name

        WebElement username1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username1.sendKeys("abcd");
        Thread.sleep(100);



        WebElement username2 = driver.findElement(By.xpath("//input[@class='span2']"));
        username2.sendKeys("rggg");
        Thread.sleep(100);

        WebElement username3 = driver.findElement(By.xpath("//input[@name='_username']"));
        username3.sendKeys("htrhrt");
        Thread.sleep(100);

        WebElement username4 = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        username4.sendKeys("rgg");

        //enter password
        WebElement password1 = driver.findElement(By.xpath("//input[@type='password']"));
        password1.sendKeys("rggg");
        Thread.sleep(200);

        WebElement password2 = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password1.sendKeys("rggg");
        Thread.sleep(200);

        WebElement password3 = driver.findElement(By.xpath("//input[@class='span2']"));
        password1.sendKeys("rggg");
        Thread.sleep(200);

        WebElement password4 = driver.findElement(By.xpath("//input[@name='_password']"));
        password1.sendKeys("rggg");
        Thread.sleep(200);

        WebElement password5 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password1.sendKeys("rggg");
        Thread.sleep(200);



        //click login button
        WebElement loginbutton1 = driver.findElement(By.xpath("//button[@type='submit']"));
        System.out.println("type= " +loginbutton1.getText());
        System.out.println("type= " +loginbutton1.getAttribute("type"));

        WebElement loginbutton2 = driver.findElement(By.xpath("//button[@class='btn btn-uppercase btn-primary pull-right']"));
        System.out.println("class= " +loginbutton1.getText());
        System.out.println("class= " +loginbutton1.getAttribute("class"));

        WebElement loginbutton3 = driver.findElement(By.xpath("//button[@id='_submit']"));
        System.out.println("id= " +loginbutton1.getText());
        System.out.println("id= " +loginbutton1.getAttribute("id"));

        WebElement loginbutton4 = driver.findElement(By.xpath("//button[@name='_submit']"));
        System.out.println("name= " +loginbutton1.getText());
        System.out.println("name= " +loginbutton1.getAttribute("name"));

        loginbutton4.click();

        //verify url contains vytrack
        String expectedText = "vytrack";
        String actualURLcontains =  driver.getCurrentUrl();

        if (actualURLcontains.contains(expectedText)){
            System.out.println("Test PASSED");
        }else{
            System.err.println("Test FAILED");
        }


        //click forgot password link

        //önce geri gelmeliyiz:
        driver.navigate().back();
        Thread.sleep(2000);

        WebElement forgotPassword = driver.findElement(By.xpath("//a[@href='/user/reset-request']"));
                forgotPassword.click();
                Thread.sleep(2000);

        //verify title "Forgot Password
        String expectedTitle ="Forgot Password";
        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);

        if (expectedTitle.equals(actualtitle)){
            System.out.println("Title verification passed");
        }else{
            System.err.println("title verif failed");
        }




    }
}
