package com.cydeo.tests.Day07_WebTables_Utilities_JavaFakers;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {

    @Test
    public void  crm_login_test() {

        driver.get("http://login1.nextbasecrm.com/");

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassWord = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassWord.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver, "Portal");

    }
    /*
    @Test
    public void  crm_login_test2(){

        driver.get("http://login1.nextbasecrm.com/");

        //calling the method to login helpdesk
        CRM_Utilities.crm_login(driver);

        BrowserUtils.verifyTitle(driver, "Portal");
 }
*/


    @Test
    public void  crm_login_test3(){

        driver.get("http://login1.nextbasecrm.com/");

        //calling the method to login helpdesk
        CRM_Utilities.crm_login(driver, "helpdesk1@cybertekschool.com", "UserUser");

        BrowserUtils.verifyTitle(driver, "Portal");



    }

    @Test
    public void  crm_login_test4(){

        driver.get("http://login1.nextbasecrm.com/");

        //calling the method to login helpdesk
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

        BrowserUtils.verifyTitle(driver, "Portal");



    }
}
