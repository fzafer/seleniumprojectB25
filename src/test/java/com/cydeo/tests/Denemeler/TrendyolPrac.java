package com.cydeo.tests.Denemeler;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Xpath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrendyolPrac {

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://www.trendyol.com/");

    }

    @Test
    public void trendyol_test1(){

       Xpath.xpath("/html//div[@id='sfx-discovery-search-suggestions']//input").sendKeys("erkek kol saati" + Keys.ENTER);

       Xpath.xpath("//div[@id='sticky-aggregations']/div[@class='aggrgtn-cntnr-wrppr']/div[5]/div[@class='fltr-cntnr-ttl-area']/div[@class='fltr-cntnr-ttl']").click();

       WebElement priceMin = Xpath.xpath("/html//div[@id='sticky-aggregations']/div[@class='aggrgtn-cntnr-wrppr']//div[@class='fltr-srch-prc-rng']/input[1]");
       priceMin.sendKeys("500");

       WebElement priceMax = Xpath.xpath("/html//div[@id='sticky-aggregations']/div[@class='aggrgtn-cntnr-wrppr']//div[@class='fltr-srch-prc-rng']/input[2]");
       priceMax.sendKeys("1000" + Keys.ENTER);






    }



}
