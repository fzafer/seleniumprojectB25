package com.cydeo.tests.Day07_WebTables_Utilities_JavaFakers;

import com.cydeo.tests.base.TestBase;
import org.testng.annotations.Test;

public class WebTable1 extends TestBase{

    @Test
    public void webTableTest(){

    //http://practice.cybertekschool.com/tables
    driver.get("http://practice.cybertekschool.com/tables");

    // P1. WRITE a locator that returns table 1 itself
        //table[@id='table1']


    //2. write a locator that returns all of the rows inside the table
        //table[@id='table1']//tr

    //3. write a locator that returns all of the rows inside the body -table
        //table[@id='table1']/tbody//tr
        //(yani header hariç)

    //4. write a locator that returns ONLY 3rd rows inside the body
        //table[@id='table1']/tbody//tr[3]

    //5. write a locator that returns all of the cells in all of the rows inside the body
        //table[@id='table1']/tbody//tr//td -->

        //table[@id='table1']//tr//td -->
        // if there is no th we can use this too

    //6. write a locator that returns all of the first names from the table
      //  yani td 2'deki tüm hücreler'





    }


}
