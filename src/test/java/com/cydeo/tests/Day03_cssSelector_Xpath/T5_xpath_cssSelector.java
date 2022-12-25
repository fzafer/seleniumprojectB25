package com.cydeo.tests.Day03_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_xpath_cssSelector {

    public static void main(String[] args) {

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
        WebElement username = driver.findElement(By.cssSelector("input[value='login-inp']"));
      //  WebElement username = driver.findElement(By.xpath("//input[@className='login-inp']"));
        username.sendKeys("incorrect");

        //tagName[@attribute='value']
        //    - using name attribute         : //a[@name='uh68']
        //        - using class attribute     : //a[@class='ff58']
        //        - using id attribute         : //a[@id='bb22']

        //    #1- //tagName[@attribute='value']
        //    #2- //tagName[contains(@attribute, 'value')]
        //    #3- //tagName[.='text']  same as //tagName[text()='text']
        //    #4- //*[@attribute='value']

        ////*[@id="login-popup"]/form/div[2]/div[1]/input
        ////*[@id="login-popup"]/form/div[2]/div[1]/input

        //4- Click to `Reset password` button
        WebElement resetButton = driver.findElement(By.xpath("//button[@className='login-btn']"));
        resetButton.click();


        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement errorText = driver.findElement(By.xpath("//input[@className='errortext']"));



        String expectedText = "Login or E-mail not found";
        String actualText = errorText.getText() ;

        System.out.println("Reset text: " + actualText);

        if (expectedText.equals(actualText)){
            System.out.println("Error label verification PASSED!");
        } else {
            System.out.println("Error label verification FAILED!!!");
        }



        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from



    }
}
