package com.cydeo.tests.day2_locators_getTest_attribution.T1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

    public static void main(String[] args) {


        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //2. Go to https://www.imdb.com
        driver.get("https://www.imdb.com");




        //3. Verify title:
        //Expected: IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows
        String expectedTitle= "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED!");
        }else {
            System.err.println("FAILED!!!");
        }



      //  driver.close();


    }
}
