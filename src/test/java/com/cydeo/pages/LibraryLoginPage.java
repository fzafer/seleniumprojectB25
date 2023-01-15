package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {


    //1. initialize drivar instance
    //this is our constructor
    public LibraryLoginPage(){

        /*
        initElements method will create connection in between the
        current driver session (instance) and the obj of the current class
         */
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // 2. use @FindBy to locate web elements

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(xpath = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement singInButton;




}
