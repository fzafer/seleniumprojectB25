package com.cydeo.tests.Day11_DriverClose_Actions_JSexecutor;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Xpath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPrac1 {

    @Test
    public void jsexecuter_scroll_task4And5(){

        Driver.getDriver().get("http://practice.cybertekschool.com/");

        //sayfanın altında powered by yazısına kadar scrolll yapacağız
        WebElement poweredByText = Xpath.xpath("//div[@id='page-footer']//div[text()='Powered by ']");


        Actions actions = new Actions(Driver.getDriver());


        //burada scroll edip elementi bulunca duruyor:
        actions.moveToElement(poweredByText).perform();
/*
        //burda sayfanın başında bir yerde durup 2 saniye beklesin dedik
        actions.moveToElement(Xpath.xpath("//h1[.='Test Automation Practice']")).pause(2).perform();
*/

        //scroll back to home button using PAGE UP button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();

       // Driver.getDriver().quit();
        Driver.closeDriver();

/*
burda shorttaki metod:

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(3);

        //burada scroll edip elementi bulunca duruyor:
        js.executeScript("arguments[0].scrollIntoView(true);",poweredByText);
        BrowserUtils.sleep(3);

        //click ekleyebiliriz
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()",poweredByText);
        BrowserUtils.sleep(3);
 */
    }
        @Test
        public void test2(){
            Driver.getDriver().get("http://practice.cybertekschool.com/");
            Driver.closeDriver();

        }
    @Test
    public void test3(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");
        Driver.closeDriver();

    }
    @Test
    public void test4(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");
        Driver.closeDriver();

    }

}
