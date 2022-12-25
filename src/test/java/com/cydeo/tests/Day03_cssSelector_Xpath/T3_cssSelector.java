package com.cydeo.tests.Day03_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_cssSelector {

    public static void main(String[] args) {



    //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
    //1- Open a chrome browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();


    //2- Go to: https://login1.nextbasecrm.com/
     driver.get("https://login1.nextbasecrm.com/");

    //3- Verify “Log in” button text is as expected:
    //Expected: Log In
       // WebElement loginButton = driver.findElement(By.className("login-btn"));


      //  tagName[attribute='value']


      //  input[class='login-btn']


    // WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
 //    WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

      //  WebElement loginButton = driver.findElement(By.cssSelector("input[onlick='BX.addClass(this, 'wait');']"));
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedText = "Log In";
    String actualText = loginButton.getAttribute("value") ;

        System.out.println("Sign in button attribute: " + actualText);

        if (expectedText.equals(actualText)){
            System.out.println("Login button label verification PASSED!");
        } else {
            System.out.println("Login button label verification FAILED!!!");
        }
    //PS: Inspect and decide which locator you should be using to locate web
    //elements.
    //PS2: Pay attention to where to get the text of this button from




}}
