package com.cydeo.tests.Day09_JavaFaker_TestBase_DriverUtils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JacaFaker_Prac {

    @Test
    public void test1(){
    //creating Faker obj to reach the methods
    Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //create random number
        String randomNumber = faker.numerify("###-###-####");
        System.out.println(randomNumber);

        System.out.println(faker.numerify("555-###"));
        System.out.println(faker.letterify("ten??-??"));
        System.out.println(faker.letterify("TEN??-??", true));

        System.out.println(faker.bothify("ZZ??-33##"));

        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Messi\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Messi"));


    }
}
