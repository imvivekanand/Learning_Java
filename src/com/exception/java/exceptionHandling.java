package com.exception.java;

public class exceptionHandling {
    public static void main(String[] args){
        //Exception Handling
        System.out.println("Program Starts");

        int[] myArray = {3, 45, 8, 10};
//        System.out.println(myArray[23]); //Exception occurred

        try{
            int result = myArray[1]/0;          //ArithmaticException
            System.out.println(myArray[23]);  //ArrayIndexOutOfBoundException Occoured
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException exception){
            //Your Code.. Optional
            System.out.println(exception);
        } finally {
            //Our Code Optional
            System.out.println("The finally is always executed.");
        }

        try{
            String s = null; //Null means no object
            System.out.println(s.length());
        } catch (Exception ex){
            System.out.println(ex);
        }

        System.out.println("Program Ends");
    }
}
