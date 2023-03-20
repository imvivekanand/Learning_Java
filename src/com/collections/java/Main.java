package com.collections.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> namesList = new ArrayList();
        namesList.add("Vivek");
        namesList.add("Anand");
        namesList.add("Winter");
        namesList.add("Vivek");

        namesList.remove(3);                //Removes the element Vivek
        namesList.add(3, "Sal");    //Add "Sal" at index 3
        namesList.set(1, "Vivek");               //Replace element at index 1 by "Vivek"

        namesList.remove("Anand");

        for(String name: namesList){
            System.out.println(name);
        }

        //Create a ArrayList of Employee and print out the names.

        Employee e1 = new Employee("Albert");
        Employee e2 = new Employee("Paul");
        Employee e3 = new Employee("Jphn");

        List<Employee> employeeList = new ArrayList();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        for (Employee employee: employeeList){
            System.out.println(employee.name);
        }
    }
}

class Employee {
    String name;

    public Employee (String name){
        this.name = name;
    }
}
