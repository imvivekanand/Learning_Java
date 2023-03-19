package com.interfaces.java;

public class InterfaceClass {
    public static void main(String[] args){
//        new Animal();  -> Not allowed for interface class

        Animal animal = new Dog();
        animal.eat();
        animal.run();

    }
}

interface Animal{
//    public static final float pi = 3.14f;
    abstract public void run(); //Interface only contain abstract method.

    abstract public void eat();

}

class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating.");
    }

    @Override
    public void run() {
        System.out.println("Dog is running.");
    }
}
