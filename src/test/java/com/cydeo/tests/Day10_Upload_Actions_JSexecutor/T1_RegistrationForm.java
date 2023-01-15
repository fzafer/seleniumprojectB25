package com.cydeo.tests.Day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_RegistrationForm {


    //http://practice.cybertekschool.com/registration_form

    @Test
    public void registrationForm_test1(){

        //prop dosyasına adresi yapıştırdık, key value ile çapırıyoruz
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //create name from javafaker
        Faker faker = new Faker();


        //write first name
        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        lastName.sendKeys(faker.bothify("zaf#######"));

        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.letterify("z####@######.com"));

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.bothify("z##########"));

        WebElement phone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(faker.numerify("###########"));

        WebElement radioButton = Driver.getDriver().findElement(By.xpath("//input[@name='gender']"));
        radioButton.click();

        WebElement birthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys("11/12/1996");

        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9) );










    }
}
