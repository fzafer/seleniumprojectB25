package com.cydeo.tests.Day08_Properties_ConfigurationReader;

import com.cydeo.base.TestBase;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties extends TestBase {

    @Test
    public void reading_properties_test() throws IOException {

        //1. create obj of properties class

        Properties properties = new Properties();

        //2. open the file in the java memory
        FileInputStream file = new FileInputStream("configuration.properties");
        //right click on configuration.properties, copy path, content root

        //3. load the prop obj
        properties.load(file); //throws extension ekledik

        //4. use prop obj to read value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));




        //browser=chrome
        //env=https://login1.nextbasecrm.com
        //username=helpdest1@cydeo.com
    }
}
