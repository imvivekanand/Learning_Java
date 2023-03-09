package com.method.java;

import org.w3c.dom.ls.LSOutput;

public class BankingApplication {
    public static void main(String[] arge) {
        //WAP for simple interest. SI = P * R * T / 100
        //user 1: P = 10000, R = 8.5, T = 2 years
        int principal1 = 10000;
        float rateOfInterest1 = 8.5f;
        int timePeriod1 = 2;
//        double si1 = principal1 * rateOfInterest1 * timePeriod1 / 100;
//        System.out.println(si1);
        calculateSimpleInterest(principal1, rateOfInterest1, timePeriod1);

        //user 2: P = 180000, R = 9.5, T = 4 years
//        int principal2 = 180000;
//        float rateOfInterest2 = 9.5f;
//        int timePeriod2 = 4;
//        double si2 = principal2 * rateOfInterest2 * timePeriod2 / 100;
//        System.out.println(si2);
        calculateSimpleInterest(180000, 9.5f, 4);

        //user3
        //user4
        //user5
    }

    public static void calculateSimpleInterest(int principal, float rate, int time){
        double SI = principal * rate * time / 100;
        System.out.println(SI);
        return;
    }
}
