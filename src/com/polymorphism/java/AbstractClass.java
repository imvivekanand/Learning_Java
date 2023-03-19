package com.polymorphism.java;

public class AbstractClass {
    public static void main(String[] arge){
//       new Birds();  -> Cannot create object for abstract class.
        Birds birds;

        Birds birds1 = new Pegion();
        birds1.eat();
        birds1.fly();
    }
}

abstract class Birds{
    public void fly(){
        System.out.println("Bird is flying.");
    }
    abstract public void eat(); //{}-> No body allowed.
}

class Pegion extends Birds{
    public void fly(){
        System.out.println("Pegion is flying");
    }

    @Override
    public void eat(){
        System.out.println("Pegion is eating");
    }
}