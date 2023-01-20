package com.cydeo.tests.Day12_PageObjectModel_Synchronization.SeleniumDrivers_Adam;

public interface WebDriver extends SearchContext{

    void get(String url);
    void close();
    void quit();


}
