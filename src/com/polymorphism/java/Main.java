package com.polymorphism.java;


public class Main {
    public static void main(String[] args){
//        Dog dog = new Dog();
//        dog.run();

        Animal animal1 = new Animal();
        animal1.run();

        Animal animal2 = new Dog(); //Upcasting
        animal2.run();

        Dog dog = (Dog) new Animal(); //Downcasting
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