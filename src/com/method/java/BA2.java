package com.method.java;

public class BA2 {
    public static void main(String[] args){
        double SI1 = calculateSI(100000, 11, 6);
        System.out.println(SI1);
    }

    public static double calculateSI(int P, float R, int T){
        double SI = P * R * T / 100;
        return  SI;
    }
}
