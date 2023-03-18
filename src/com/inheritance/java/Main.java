package com.inheritance.java;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        //Note: Always use getters and setters. This simple code is meant to explain Inheritance concept.

        Dog dog = new Dog();
        dog.name = "Labrador";
        dog.color = "Black";
        dog.bark();
        dog.run();

        Cat cat = new Cat();
        cat.name = "Indian Cat";
        cat.pattern = "Tabby";
        cat.meow();
        cat.run();

        Animal animal = new Animal();
        animal.name = "Billa";
        animal.run();

        Puppy puppy = new Puppy();
        puppy.size = "small";
        puppy.age = 1;

    }
}

class Animal{
    String name;

    public void run(){
        System.out.println("Animal is running!");
    }
}

class Dog extends Animal{
    String color;

    public void bark(){
        System.out.println("Wooh ! wOOH !");
    }
}

class Cat extends Animal{
    String pattern;

    public void meow(){
        System.out.println("Meow! Meow!");
    }
}

class Puppy extends Animal{
    String size;
    int age;
}
