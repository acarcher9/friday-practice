package com.tts;

public class Main {

    public static void main(String[] args) {
// Is this thing on?
        System.out.println("Hello World.");

//  Initializing a few different variables and their data types.
        int myAge = 27;
        String myName = "Annie";
        boolean doIHaveACat = true;
        char middleNameInitial = 'C';

// Concatenating those variables to make a sentence.
        System.out.println(myName + " " + middleNameInitial + ". is " + myAge + ".");
        System.out.println("Does she have a cat? That would be... " + doIHaveACat  + ". \nShe has two!");

//  Creating errors:
//       "java: incompatible types: possible lossy conversion from double to int"
//        int sisterAge = 24.5;
        int sisterAge = 24;
        String sistersName = "Emily";

//   "java: cannot find symbol
//   symbol:   variable Boston
//  location: class com.tts.Main"
//        boolean WhereSheLives =  Boston;

    System.out.println("My sister's name is " + sistersName);

//    Attempting some math:
        int combinedAge = myAge + sisterAge;
        String theSecret = "Our combined age is in fact...";
        System.out.println(theSecret + combinedAge);



    }
}


// Instructions:
// Create a small program that defines some fields. Try creating some illegal field names and see what kind of error the compiler produces. Use the naming rules and conventions as a guide. In the program you created, try leaving the fields uninitialized and print out their values. Try the same with a local variable and see what kind of compiler errors you can produce. Becoming familiar with common compiler errors will make it easier to recognize bugs in your code.