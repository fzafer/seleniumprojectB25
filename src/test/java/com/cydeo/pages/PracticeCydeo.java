package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeCydeo {

    //1.create constructor and instances

    public PracticeCydeo(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//div[@id='content']/ul[@class='list-group']//a[@href='/abtest']")
    public WebElement abTesting;
}
