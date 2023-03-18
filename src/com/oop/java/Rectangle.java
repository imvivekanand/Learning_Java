package com.oop.java;

public class Rectangle {
//    public float length;
//    public float breadth;



//    public Rectangle(){                 //Default Constructor
//        System.out.println("Default Constructor Triggered");
////        this(20f,48f);
//    }
//
//    public Rectangle(float l, float b){     //Parameterized Constructor
//        System.out.println("Parameterized Constructor Triggered");
//        length = l;
//        breadth = b;
//    }
//
//    public Rectangle(float length){
//        this.length = length;
////        r1 == this -> from main.java
//    }

//    public void getArea(){
//        float area = length * breadth;
//        System.out.println("Area of the rectangle is: " + area);
//    }
//
//    public void getPerimeter(){
//        float perimeter = 2*(length+breadth);
//        System.out.println("Perimeter of the rectangle is: " + perimeter);
//    }

    //Getter And Setter Lecture
    private float length;
    private float breadth;

    public float getArea(){
        float area = length * breadth;
        return area;
    }

    public float getPerimeter(){
        float perimeter = 2 * (length + breadth);
        return perimeter;
    }

    public float getLength() {  //Getter for length
        return length;
    }

    public void setLength(float length) { //Setter for length
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
}
