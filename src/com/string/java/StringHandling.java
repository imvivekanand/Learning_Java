package com.string.java;

public class StringHandling {
        public static void main(String[] args){
            //String Handling

            //Index            0    1    2    3    4    5    6          --> length of 7
            char[] myArray = {'W', 'E', 'L', 'C', 'O', 'M', 'E'};

            //Using Literals to create String
            String firstString = "Welcome";     //Sequence of characters   //S1
            String secondString = "Welcome"; //S1

            //Using new keyword
            String thirdString = new String("Welcome"); //S2

            System.out.println(firstString == secondString); //Compare two objects .. true
            System.out.println(firstString == thirdString); //Compare two objects .. false
            System.out.println(firstString.equals(thirdString)); //Compare two values .. true



            System.out.println(myArray);
            System.out.println(firstString);

            System.out.println(myArray.length);
            System.out.println(firstString.length());

            System.out.println(firstString.charAt(6));

            System.out.println(firstString.toUpperCase()); //WELCOME
            System.out.println(firstString.toLowerCase()); //welcome

            System.out.println(firstString.contains("come")); //true
            System.out.println(firstString + "to Internshala");

            System.out.println(firstString.concat("to Internshala"));
        }
}

