package com.cydeo.tests.Denemeler;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class amazondeneme {

    @Test
    public void amazontest1(){
        Driver.getDriver().get("https://www.amazon.com/s?k=watch&page=2&crid=30ULAQFVQRFQ6&qid=1674232097&sprefix=watch%2Caps%2C203&ref=sr_pg_2");

        List<WebElement> allLinks = (List<WebElement>) Driver.getDriver().findElements(By.className("s-image"));
        System.out.println("allLinks.size() = " + allLinks.size());

        List<WebElement> prices = (List<WebElement>) Driver.getDriver().findElements(By.className("a-offscreen"));
        System.out.println("prices.size() = " + prices.size());

       int i = 1;
        for (WebElement each: allLinks)  {
            System.out.println(i + " "+ each.getAttribute("alt") + " ");
            i++;

        }
        int k = 1;
        for (WebElement each2: prices){
            System.out.println(each2.getText());
        }




        /*
        for (int k = 0,  j=0; k < allLinks.size(); k++, j++) {
            System.out.println(i + " "+ allLinks[k].getAttribute("alt") + " ");
        }
        */


    }
}
