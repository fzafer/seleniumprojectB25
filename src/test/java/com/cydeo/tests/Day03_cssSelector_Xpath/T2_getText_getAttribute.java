package com.cydeo.tests.Day03_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {



    //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
    //1- Open a chrome browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    //2- Go to: https://login1.nextbasecrm.com
    driver.get("https://login1.nextbasecrm.com/");

    //3- Verify “remember me” label text is as expected:
    //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String actualText = rememberMeLabel.getText();
        String expectedText = "Remember me on this computer";

        if (expectedText.equals(actualText)){
            System.out.println("Label verification PASSED!");
        } else {
            System.out.println("Label verification FAILED!!!");
        }


    //4- Verify “forgot password” link text is as expected:
    //Expected: Forgot your password?
        WebElement forgotPassowrdLinkText = driver.findElement(By.className("login-link-forgot-pass"));
        String actualforgotPassowrdLinkText = forgotPassowrdLinkText.getText();
        String expectedforgotPassowrdLinkText = "FORGOT YOUR PASSWORD?";

        if (expectedforgotPassowrdLinkText.equals(actualforgotPassowrdLinkText)){
            System.out.println("Forgot password link verification PASSED!");
        } else {
            System.out.println("Forgot password link verification FAILED!!!");
        }


    //5- Verify “forgot password” href attribute’s value contains expected:
    //Expected: forgot_password=yes
        WebElement forgotPassowrdHrefAttribute = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPassowrdHrefAttribute = forgotPassowrdHrefAttribute.getAttribute("href");
        String expectedForgotPassowrdHrefAttribute = "forgot_password=yes";



        if (expectedForgotPassowrdHrefAttribute.contains(actualForgotPassowrdHrefAttribute)){
            System.out.println("Forgot password attribute verification PASSED!");
        } else {
            System.out.println("Forgot password attribute verification FAILED!!!");
        }

        System.out.println(actualforgotPassowrdLinkText);
        System.out.println(actualForgotPassowrdHrefAttribute);

    //PS: Inspect and decide which locator you should be using to locate web
    //elements.
}}
