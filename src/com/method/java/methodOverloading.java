package com.method.java;

public class methodOverloading {
    public static void main(String[] args){
        add(); //Method1

        add(10, 15); //Method2

        add(12f, 8.6f, 2.22f); //Method3
    }

    public static void add(){ //Method1
        int sum = 5 + 15157;
        System.out.println(sum);
    }

    public static void add(int a, int b){ //Method2
        int sum = a + b;
        System.out.println(sum);
    }

    public static void add(float a, float b, float c){ //Method3
        float sum = a + b - c;
        System.out.println(sum);
    }
}