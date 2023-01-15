package com.cydeo.tests.Day09_JavaFaker_TestBase_DriverUtils;

public class Singleton {

    //1 create private constructor
    private Singleton(){}

    //2 create priv static String
    //to prevent access and to provide getter method
    public static  String word;

    //this utility method will return WORD int the way we want to return
    public static String getWord() {

        if(word==null){
            System.out.println("first time call. Word object is null." +
                    "Assigning value to it now!");
            word = "something";

        }else{
            System.out.println("Word already has a value");
        }

        return word;
    }

}
