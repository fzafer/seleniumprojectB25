package com.cydeo.tests.Denemeler;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class denemeVel {

static WebDriver driver;

@BeforeTest
    public static void setupMethod() throws InterruptedException{
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test
    public void test() throws InterruptedException{
    driver.get("https://demoqa.com/elements");
        WebElement textbox = driver.findElement(By.xpath("//span[@class='text']"));

        Thread.sleep(3000);
        textbox.click();
    }



}
