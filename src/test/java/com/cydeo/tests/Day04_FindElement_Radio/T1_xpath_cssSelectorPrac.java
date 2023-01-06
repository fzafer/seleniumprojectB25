package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelectorPrac {

    public static void main(String[] args) {


        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //with cssSelector SYNTAX#1:
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //with SYNTAX#2::
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));

        //with cssSelector with href::
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header
        //with cssSelector SYNTAX#1:
        WebElement header1 = driver.findElement(By.cssSelector("div.example > h2"));

        //with xpath:
        WebElement header2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


        //c. “E-mail” text
        //with cssSelector SYNTAX#1:
        WebElement emailLabel1 = driver.findElement(By.cssSelector("label[for='email']"));

        //with xpath:
        WebElement emailLabel2 = driver.findElement(By.xpath("//label[@for='email']"));


        //d. E-mail input box
        //with cssSelector SYNTAX#1:
        WebElement emailInputBox1 = driver.findElement(By.cssSelector("input[name='email']"));

        //with xpath with contains method:
        WebElement emailInputBox12 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));



        //e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//i[.='Retrieve password']"));


        //f. “Powered by Cydeo text
        WebElement poweredByText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        WebElement div1 = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']"));
        WebElement cydLink = driver.findElement(By.xpath("//a[.='CYDEO']"));




        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("emailLabel1.isDisplayed() = " + emailLabel1.isDisplayed());
        System.out.println("emailInputBox1.isDisplayed() = " + emailInputBox1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());
        System.out.println("div1is displayed = " + div1.isDisplayed());
        System.out.println("cydLink.isDisplayed() = " + cydLink.isDisplayed());

    }
}
