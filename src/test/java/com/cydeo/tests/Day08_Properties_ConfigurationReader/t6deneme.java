package com.cydeo.tests.Day08_Properties_ConfigurationReader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t6deneme {




    public static void main() {

        WebDriver driver;
        List<String> expectedDates = new ArrayList<>(Arrays.asList("1932", "December", "1"));

        //Open chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Go to : "https://practice.cydeo.com/dropdown"
        driver.get("http://practice.cybertekschool.com/dropdown");



        WebElement currentlySelectedDate;
        String actualYear = "", acutalMonth = "", acutalDay = "";
        List<String> idOfTags = new ArrayList<>(Arrays.asList("year", "month", "day"));

        List<String> actualSelectedDates = new ArrayList<>(Arrays.asList(actualYear , acutalMonth , actualYear));

        for (int i = 0; i < idOfTags.size(); i++) {
            Select selectDropdown = new Select(driver.findElement(By.id(idOfTags.get(i))));
            selectDropdown.selectByValue(expectedDates.get(i));

            currentlySelectedDate = selectDropdown.getFirstSelectedOption();
            actualSelectedDates.set(i , currentlySelectedDate.getText());
        }

        System.out.println(actualSelectedDates);



        List<String> takenDates = new ArrayList<>(Arrays.asList(actualYear , acutalMonth , acutalDay));
        for (int i = 0; i < expectedDates.size(); i++){
            Assert.assertEquals(takenDates.get(i) , expectedDates.get(i));
        }
    }
}
