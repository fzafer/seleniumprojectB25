package com.cydeo.tests.Day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownTask {
    WebDriver driver;
@BeforeMethod

    public void setupethod() {

    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://practice.cybertekschool.com/dropdown");
}
        @Test
        public void dropdownTasks() throws InterruptedException{
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illionis");

        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        String expected = "California";
        String actual = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual,expected);
    }

        @Test
        public void dropdown_task6(){
        Select yearDropdown = new Select(driver.findElement(By.xpath("select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("select[@id='day']")));




        }


}
