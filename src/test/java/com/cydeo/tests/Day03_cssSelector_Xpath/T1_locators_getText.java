package com.cydeo.tests.Day03_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {


        //TC #1: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username into login box:

       // driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");

        //4- Click to `Reset password` button
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement clickButton = driver.findElement(By.className("login-btn"));
        clickButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
       // PS:
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMesssage = errorMessage.getText();

        if (expectedErrorMessage.equals(actualErrorMesssage)){
            System.out.println("Error message verification PASSED!");
        } else {
            System.out.println("Error message verification FAILED!!!");
        }







        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
