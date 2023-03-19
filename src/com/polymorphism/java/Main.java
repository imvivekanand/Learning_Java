package com.polymorphism.java;


public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.run();
    }
}

class Animal {
    public void run(){
        System.out.println("Animal is running.");
    }
}

class Dog extends Animal{
    public void run(){
        System.out.println("Dog is running.");
    }  //Method overriding

}