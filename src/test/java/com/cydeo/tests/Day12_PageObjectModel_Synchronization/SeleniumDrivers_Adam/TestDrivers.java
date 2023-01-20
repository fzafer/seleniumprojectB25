package com.cydeo.tests.Day12_PageObjectModel_Synchronization.SeleniumDrivers_Adam;

public class TestDrivers {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        driver = new FirefoxDriver();
        driver.get("https://google.com");

        //downcasting
        System.out.println("((TakeScreenShot)driver).getScreenshotAs() = " + ((TakeScreenShot) driver).getScreenshotAs());
        //TIFF

        ((JavaScriptExecutor)driver).executeScript("dskjvblıdfjvnldf");
    }
}
