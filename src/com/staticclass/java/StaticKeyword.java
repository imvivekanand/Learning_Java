package com.staticclass.java;

public class StaticKeyword {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name = "Vivek";

        System.out.println(Employee.company);

        Employee.count = 20;
        System.out.println(Employee.count);

        Employee.myFirstStaticMethod();
    }

}

class Employee{
    public String name; //It will vary for each employee object.

    static final String company = "QualiMe"; //Constant value. It belongs to Class not to a object.
    public static  int count = 0;

    public static void myFirstStaticMethod(){ //Class Method
        System.out.println("My first static method.");
        System.out.println(Employee.count);
    }


}
