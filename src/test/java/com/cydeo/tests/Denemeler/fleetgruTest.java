package com.cydeo.tests.Denemeler;

import com.cydeo.pages.FleetGru.FleetGru_MainPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.FleetGru;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fleetgruTest {

    //pages'a ulaşmak için mainPage obj create ediyoruz
    FleetGru_MainPage fleetGru_MainPage;

    @BeforeMethod
    public void setupMethod(){

        //mainPage obj çağırıyoruz her testte
        fleetGru_MainPage = new FleetGru_MainPage();

        //kendi oluşturduğumuz login mathodu çağırıyoruz (şifreler conf properties dosyasında)
        FleetGru.fleetgruLogin();
    }


    @Test
    public void fleetgru_test1(){

        fleetGru_MainPage = new FleetGru_MainPage();
/*
bu kısmı Fleetgru metodumuzun içinde title verif metoduna koyduk

        //wait until dynamic title loads and verify it
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

        //wait until condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
*/
        FleetGru.verificationTitle("Dashboard");
        BrowserUtils.sleep(7);


        fleetGru_MainPage.Dashboards.click();
      //  Xpath.xpath("//div[@id='main-menu']//span[@class='title title-level-1']").click();
        BrowserUtils.sleep(2);

        //Xpath.xpath("//*[text()='Manage Dashboards']").click();
        fleetGru_MainPage.ManageDashboards.click();




        BrowserUtils.sleep(3);
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());


        //  @FindBy(xpath ="//*[text()='Manage Dashboards']")
       // public WebElement ManageDashboards;


   //  fleetGru_MainPage.ManageDashboards.click();
 FleetGru.verificationTitle("All - Manage Dashboards - Dashboards");

      //  Driver.closeDriver();




    }
}
