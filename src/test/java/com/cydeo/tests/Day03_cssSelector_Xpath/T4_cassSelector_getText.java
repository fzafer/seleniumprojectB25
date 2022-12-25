package com.cydeo.tests.Day03_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cassSelector_getText {

    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password

        //tagName[attrib='value']
        //iki seçenekten birini kullan:

        //input değil BUTTON

     // ilkinde text çalışmadı getAttrib olması gerek??
        //  WebElement resetPasswordButtonText = driver.findElement(By.cssSelector("button[class='login-btn']"));
       WebElement resetPasswordButtonText2 = driver.findElement(By.cssSelector("button[value='Reset password']"));


        String expectedText = "Reset password";
        String actualText = resetPasswordButtonText2.getText() ;

        System.out.println("Reset password button attribute: " + actualText);

        if (expectedText.equals(actualText)){
            System.out.println("Reset password button label verification PASSED!");
        } else {
            System.out.println("Reset password button label verification FAILED!!!");
        }





        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
