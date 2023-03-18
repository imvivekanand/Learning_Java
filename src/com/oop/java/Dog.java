package com.oop.java;

import java.sql.SQLOutput;

public class Dog {
    public String name;
    public String breed;
    public int size;
    public String color;

    public void bark(){
        System.out.println("Woof! Woof! Woof!");
    }

    public void run(){
        System.out.println("My breed is " + breed + ". I am running.");
    }

    //Assignment:
    //Create default constructor and parameterized constructor.
//    public Dog(){
//    }
//
//    public Dog(String b, int s, String c ){
//        breed = b;
//        size = s;
//        color = c;
//    }

}
