package com.arrays.java;

public class array {
    public static void main(String[] args){
        int[] myFirstArray = { 20, 19, 48, 7};

        System.out.println(myFirstArray[1]);

        myFirstArray[2] = 8;
        System.out.println(myFirstArray[2]);
        System.out.println(myFirstArray.length);

        for(int i = 0; i < myFirstArray.length; i++){
            System.out.println(myFirstArray[i]);
        }

//        myFirstArray[4] = 9; Not Allowed


        float[] mySecondArray = new float[3];
        mySecondArray[0] = 34.2f;
        mySecondArray[1] = 4.6f;
        mySecondArray[2] = 78.11f;


        char[] myThirdArray;
        double[] myForthArray;
        boolean[] myFifthArray;
        String[] mySixthArray;


    }
}
