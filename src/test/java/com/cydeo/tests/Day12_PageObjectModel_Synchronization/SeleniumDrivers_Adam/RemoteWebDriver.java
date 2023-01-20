package com.cydeo.tests.Day12_PageObjectModel_Synchronization.SeleniumDrivers_Adam;

public class RemoteWebDriver implements TakeScreenShot, JavaScriptExecutor, WebDriver {


    @Override
    public void executeScript(String script) {
        System.out.println("I will execute that " + script);
    }

    @Override
    public void findElement() {
        System.out.println("Find element by " + getClass().getSimpleName());
    }

    @Override
    public void findElements() {
        System.out.println("Find elements by " + getClass().getSimpleName());

    }

    @Override
    public String getScreenshotAs() {
    return "PNG";
    }

    @Override
    public void get(String url) {
        System.out.println("Open the " + url + " in " + getClass().getSimpleName());
    }

    @Override
    public void close() {
        System.out.println("Close the " +getClass().getSimpleName());
    }

    @Override
    public void quit() {
        System.out.println("Quit the " +getClass().getSimpleName());

    }
}