package com.cydeo.tests.Day04_FindElement_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Prac_CheckBox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/checkboxes");

        //2 ayrı yolla checkbox1'i bulma pratiği
        WebElement checkbox1 =  driver.findElement(By.xpath("//input[@id='box1']"));
        WebElement checkbox1c = driver.findElement(By.xpath("//input[@name='checkbox1']"));

        //checked ise orada bu ifade yer alıyor ama bunu isChecked boolean'ı ile soruyoruz
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox1c.isSelected() = " + checkbox1.isSelected());

        checkbox1.click();

        System.out.println("after click checkbox1.isSelected() = " + checkbox1.isSelected());

        //aynı şeyi checkbox2'ye uyguluyoruz
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        WebElement checkbox2b = driver.findElement(By.xpath("//input[@id='box2']"));

        WebElement checkbox2css = driver.findElement(By.cssSelector("[name='checkbox2']"));


        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        System.out.println("checkbox2b.isSelected() = " + checkbox2b.isSelected());
        System.out.println("checkbox2css.isSelected() = " + checkbox2css.isSelected());


        checkbox2.click();
        System.out.println("after click checkbox2.isSelected() = " + checkbox2.isSelected());
        Thread.sleep(300);

        checkbox2b.click(); //burada checked yazıyor mu ona bakıyoruz (isslected yerine)
        System.out.println("after click checkbox2.isSelected() = " + checkbox2.getAttribute("checked"));
        Thread.sleep(300);

        checkbox2b.click(); //burada checked yazıyor mu ona bakıyoruz (isslected yerine)
        System.out.println("after click checkbox2.isSelected() = " + checkbox2.getAttribute("checked"));
        Thread.sleep(300);
        // burada checked ifadesi artık yazmadığı için NULL oldu
        driver.close();





    }
}
