package com.iterators.java;

import java.util.Scanner;

public class IsPrimeFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = true;

        for(int i=2; i<=num/2; i++) {
            if(num%i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        input.close();
    }
}
