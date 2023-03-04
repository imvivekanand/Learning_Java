package com.iterators.java;

public class While {
    public static void main(String[] args){
        int num = 1;
        while(num<=10){
            System.out.println(num);
            num++;
        }

        int number = 5;
        long factorial = 1;

        while(number>0){
//            factorial = factorial * number;
            factorial *= number;
            number--;
        }
        System.out.println(factorial);
    }
}
