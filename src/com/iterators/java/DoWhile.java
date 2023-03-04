package com.iterators.java;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        int number = 1;
//        do{
//            System.out.println(number);
//            number++;
//        } while(number<10);
//    }

        Scanner scanner = new Scanner(System.in);

        double num = 1;
        double sum = 0;

        do {
            System.out.println("Enter a number:");
            num = scanner.nextDouble();
            sum += num;
        } while (num != 0);
        System.out.println("The sum is: " + sum);


    }
}


