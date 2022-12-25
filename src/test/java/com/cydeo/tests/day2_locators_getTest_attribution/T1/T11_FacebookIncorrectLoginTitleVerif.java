package com.cydeo.tests.day2_locators_getTest_attribution.T1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T11_FacebookIncorrectLoginTitleVerif {

    public static void main(String[] args) {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
        WebElement usernameInput = driver.findElement(By.id("email"));
        usernameInput.sendKeys("incorrect@gmail.com");



        //4. Enter incorrect password
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("incorrectPassword"+ Keys.ENTER);

        //+ Keys.ENTER) yerine şunu da yapabiliriz: sign in butonunu bulup tıklamak:
      //  WebElement signInButton = driver.findElement(By.tagName("button"));
      // signInButton.click();

        //5. Verify title changed to:
        //Expected: “Log into Facebook”
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
    }
}
