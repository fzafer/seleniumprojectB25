package com.cydeo.tests.Day12_PageObjectModel_Synchronization;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMpractices {
    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
            public void setupMethod(){
        libraryLoginPage = new LibraryLoginPage();

            Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

    //do not enter any info and click to sign in button
}
    @Test
    public void required_field_error_message_test1(){



        //daha önce oluşturmuştuk sign inb buttonu çağırıyoruz
        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }
    @Test
    public void valid_email_error_message_test1() {

        BrowserUtils.sleep(3);
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.inputUsername.sendKeys("wrong");
        libraryLoginPage.signInButton.click();

        BrowserUtils.sleep(2);

        Assert.assertTrue(libraryLoginPage.enterValidEmailAddressErrorMessage.isDisplayed());

        Driver.closeDriver();




    }
    }
