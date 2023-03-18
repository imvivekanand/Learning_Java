package com.oop.java;

public class Main {
    public static void main(String[] args){
//        Dog dog1 = new Dog();
//
//        dog1.breed = "Golder Retriver";
//        dog1.color = "Golden Brown";
//        dog1.size = 51;
//
//        System.out.println(dog1.breed);
//        System.out.println(dog1.color);
//        System.out.println(dog1.size);
//
//        dog1.bark();
//        dog1.run();

//        Rectangle rectangle1 = new Rectangle();   //->Creates new rectangle inside the heap memory.
//
//        rectangle1.length = 555f;
//        rectangle1.breadth = 666f;
//
//        Rectangle r2 = new Rectangle(15f, 8f);
//        System.out.println(r2.length);
//        System.out.println(r2.breadth);

//        Dog dog2 = new Dog();
//
//        dog1.name = "Tommy";
//        System.out.println(dog1.name);
//
//        Dog dog3 = new Dog("Golden Retriver", 40, "Golden Brown");
//        System.out.println(dog3.size);
//        System.out.println(dog3.color);
//        System.out.println(dog3.breed);


//        rectangle1.getArea();
//        rectangle1.getPerimeter();
//
//        Cake myFavouriteCake = new Cake();
//
//        myFavouriteCake.cakeName = "Black Forest";
//        myFavouriteCake.flavour = "Chocolate";
//        myFavouriteCake.price = 500;
//        myFavouriteCake.isAvailable = true;
//
//        System.out.println(myFavouriteCake.cakeName);
//        System.out.println(myFavouriteCake.flavour);
//        System.out.println(myFavouriteCake.price);
//        System.out.println(myFavouriteCake.isAvailable);


        //Getter And Setter Lecture:
        Rectangle r1 = new Rectangle();

        r1.setLength(12.9f);
        r1.setBreadth(12.9f);

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());

        Dog d1 = new Dog();

        d1.setName("Barky");
        d1.setBreed("Labrador");
        d1.setSize(45);
        d1.setColor("Brown");

        System.out.println(d1.getName());
        System.out.println(d1.getBreed());
        System.out.println(d1.getColor());
        System.out.println(d1.getSize());




    }
}
