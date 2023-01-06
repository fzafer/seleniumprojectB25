package com.cydeo.utilities;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils extends TestBase {

    //name: returnOrderDate
    //ret type String
    //arg1 = WebDriver driver
   // arg2= String customername

     //this method will accept a customername
    //and ret order date

    public static String returnOrderDate(WebDriver driver, String customerName){

        String locator ="//td[.='" + customerName +"']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();


    }
    //return istemiyoruz, assert yapsa yeterli, alınacak veriyle işlem yapmayacağız bunu çağırırken
public static void orderVerify(WebDriver driver,String customerName, String expectedOrderDate){

    String locator ="//td[.='" + customerName +"']/following-sibling::td[3]";

    WebElement customerDateCell = driver.findElement(By.xpath(locator));

    String actualOrderDate = customerDateCell.getText();

    System.out.println("actualOrderDate = " + actualOrderDate);
    System.out.println("expectedOrderDate = " + expectedOrderDate);
    Assert.assertEquals(actualOrderDate, expectedOrderDate);
}

}
