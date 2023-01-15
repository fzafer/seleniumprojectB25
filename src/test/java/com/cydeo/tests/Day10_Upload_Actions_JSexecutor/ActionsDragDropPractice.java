package com.cydeo.tests.Day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ActionsDragDropPractice {

    @Test
    public void dragAndDrop_test1(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

       // actions.dragAndDrop(smallCircle,bigCircle).perform();

        BrowserUtils.sleep(2);

        actions.moveToElement(smallCircle).pause(1000)
            .clickAndHold().pause(1000)
            .moveToElement(bigCircle).pause(1000)
            .release().perform();

        System.out.println(bigCircle.getText());
        assertEquals(bigCircle.getText(), "You did great!");
    }
}
