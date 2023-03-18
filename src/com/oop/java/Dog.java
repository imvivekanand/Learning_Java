package com.oop.java;

import java.sql.SQLOutput;

public class Dog {
    private String name;
    private String breed;
    private int size;
    private String color;

//    public void bark(){
//        System.out.println("Woof! Woof! Woof!");
//    }
//
//    public void run(){
//        System.out.println("My breed is " + breed + ". I am running.");
//    }

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



    //getter and setter
    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public int getSize(){
        return size;
    }

    public String getColor(){
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setColor(String color){
      this.color = color;
    }

}
