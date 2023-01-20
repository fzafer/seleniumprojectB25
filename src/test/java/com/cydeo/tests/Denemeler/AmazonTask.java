package com.cydeo.tests.Denemeler;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTask {

    @BeforeMethod
    public void SetupMethod(){
        //o https://www.amazon.com.tr/ sitesi açılır.
        //o Ana sayfanın açıldığı kontrol edilir.

        Driver.getDriver().get("https://www.amazon.com.tr/ ");

    }

    @Test
    public void amazon_test1(){

        //o  Çerez tercihlerinden Çerezleri kabul et seçilir.
        WebElement cookiesButton = Driver.getDriver().findElement(By.xpath("/html//input[@id='sp-cc-accept']"));
        cookiesButton.click();

        //o  Siteye login olunur.
        //o Login işlemi kontrol edilir.
        WebElement accountLink = Driver.getDriver().findElement(By.xpath("//a[@id='nav-link-accountList']/span"));
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(accountLink).perform();

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner']"));
        loginButton.click();

        WebElement emailLogin = Driver.getDriver().findElement(By.xpath("/html//input[@id='ap_email']"));
        emailLogin.sendKeys("fer.istatistik@gmail.com" + Keys.ENTER);

        BrowserUtils.sleep(2);
        WebElement password = Driver.getDriver().findElement(By.xpath("/html//input[@id='ap_password']"));;
        password.sendKeys("blablabla" + Keys.ENTER);

        //o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
        //o Bilgisayar kategorisi seçildiği kontrol edilir.
        Select kategorilerDropdownObj = new Select(Driver.getDriver().findElement(By.xpath("/html//select[@id='searchDropdownBox']")));
        kategorilerDropdownObj.selectByVisibleText("Bilgisayarlar");


        //o Arama alanına msi yazılır ve arama yapılır.
        //o Arama yapıldığı kontrol edilir.
        WebElement searchBar = Driver.getDriver().findElement(By.xpath("/html//input[@id='twotabsearchtextbox']"));
        searchBar.sendKeys("msi" +Keys.ENTER);

        //o Arama sonuçları sayfasından 2. sayfa açılır.
        //o 2. sayfanın açıldığı kontrol edilir.
        BrowserUtils.sleep(2);
        Driver.getDriver().get("https://www.amazon.com.tr/s?k=msi&i=computers&page=2&__mk_tr_TR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=23QLHMARAZSQJ&qid=1674152812&sprefix=msi%2Ccomputers%2C150&ref=sr_pg_2");

        // WebElement secondPageLink = Driver.getDriver().findElement(By.xpath("/html//div[@id='search']//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[36]/div/div[@role='navigation']//a[@href='/s?k=msi&i=computers&page=2&crid=2M8HBLV0K18FY&qid=1674153306&sprefix=%2Ccomputers%2C142&ref=sr_pg_2']"));
        BrowserUtils.sleep(2);
        //secondPageLink.click();

        //o Sayfadaki 2. ürün favorilere eklenir.
        //o 2. Ürünün favorilere eklendiği kontrol edilir.
        WebElement secondProduct = Driver.getDriver().findElement(By.xpath("/html//div[@id='search']//span[@class='rush-component s-latency-cf-section']/div[@class='s-main-slot s-result-list s-search-results sg-row']/div[3]/div/div/div[@class='rush-component s-expand-height']/div//div[@class='a-section a-spacing-base']/div[1]//a[@href='/sspa/click?ie=UTF8&spc=MTo3MTAxMjI2OTQwODEwNjI6MTY3NDE1MjU1NTpzcF9hdGZfbmV4dDoyMDExMTY0MTU5OTA5ODo6MDo6&url=%2FMSI-10M-416EU-Masa%25C3%25BCst%25C3%25BC-Bilgisayar-I7-10510U%2Fdp%2FB09XHZB5YQ%2Fref%3Dsr_1_26_sspa%3F__mk_tr_TR%3D%25C3%2585M%25C3%2585%25C5%25BD%25C3%2595%25C3%2591%26crid%3D2W0T9KA0NKY04%26keywords%3Dmsi%26qid%3D1674152555%26s%3Dcomputers%26sprefix%3Dmsi%252Ccomputers%252C126%26sr%3D1-26-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGZfbmV4dA%26psc%3D1']//img[@alt='Sponsorlu Reklam - MSI CUBI 5 10M-416EU Masaüstü Mini Bilgisayar, Core I7-10510U, 16GB RAM, 1TB SSD, Windows 11 Pro Beyaz']"));
        secondProduct.click();

        WebElement listeyeEkleButton = Driver.getDriver().findElement(By.xpath("/html//input[@id='add-to-wishlist-button-submit']"));
        listeyeEkleButton.click();

        //o Hesabım > Favori Listem sayfasına gidilir.
        WebElement hesap = Driver.getDriver().findElement(By.xpath("/html//span[@id='nav-link-accountList-nav-line-1']"));
        hesap.click();

        //o “Favori Listem” sayfası açıldığı kontrol edilir.
        //o Eklenen ürün favorilerden silinir.
        //o Silme işleminin gerçekleştiği kontrol edilir.
        //o Üye çıkış işlemi yapılır.
        //o Çıkış işleminin yapıldığı kontrol edilir.








    }




}
