package com.arrays.java;

public class array {
    public static void main(String[] args){

        int[] myFirstArray = { 20, 19, 48, 7};

        System.out.println(myFirstArray[1]);

        myFirstArray[2] = 8;
        System.out.println(myFirstArray[2]);
        System.out.println(myFirstArray.length);

        int sum = 0;

        for(int i = 0; i < myFirstArray.length; i++){
            sum += myFirstArray[i];
            System.out.println(myFirstArray[i]);
        }

        System.out.println("Sum of array elements " + sum);


//        myFirstArray[4] = 9; Not Allowed


        float[] mySecondArray = new float[3];
        mySecondArray[0] = 34.2f;
        mySecondArray[1] = 4.6f;
        mySecondArray[2] = 78.11f;

//          Same as for each loop below
//        for(int i = 0; i < mySecondArray.length; i++){
//            System.out.println(mySecondArray[i]);

            //For Each loop
            for(float num: mySecondArray){
                System.out.println(num);
            }

        char[] myThirdArray;
        double[] myForthArray;
        boolean[] myFifthArray;
        String[] mySixthArray;

        // Define a double array and use For Each loop to find the sum of all the numbers stored in the array.
        double[] newArr = {10.78, 20.58, 30.5};

        double sum1 = 0.0;
        for(double num5: newArr){
            sum1 += num5;
        }
        System.out.println(sum1);

        //or

                double[][] myArray = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
                double sum2 = 0.0;
                for (double[] row : myArray) {
                    for (double num : row) {
                        sum2 += num;
                    }
                }
                System.out.println("Sum of all elements in the array: " + sum2);

    }
}

