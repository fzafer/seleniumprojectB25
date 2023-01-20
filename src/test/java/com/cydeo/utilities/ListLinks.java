package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListLinks {

    public static WebElement  links(String url){
        Driver.getDriver().get(url);
        BrowserUtils.sleep(5);
        List<WebElement> allLinks = (List<WebElement>) Driver.getDriver().findElements(By.tagName("a"));
        for (WebElement eachLink : allLinks) {
            System.out.println(eachLink.getText());
        }


        return (WebElement) allLinks;
    }

    public static ArrayList<String> linksTextsArrayList(String url){
        Driver.getDriver().get(url);
        BrowserUtils.sleep(5);
        List<WebElement> allLinks = (List<WebElement>) Driver.getDriver().findElements(By.tagName("a"));
        ArrayList<String > allLinksTexts = new ArrayList<>();
        for (WebElement eachLink : allLinks) {
            allLinksTexts.add(eachLink.getText());
        }


        return allLinksTexts;
    }


}
