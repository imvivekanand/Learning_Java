package Exercise;

//1. Calculate the area of different figures like rectangle, square, circle.
//        Input the operands by the user for side length or radius.
//        For performing the same create a different class Area and make the methods for the different figures.
//        Then in the Main class, use the Area class to perform these operations.
//        Example -
//        Input: Radius = 3
//        Output: 28.26

import java.util.Scanner;

public class Area {
     // Method to calculate the area of a rectangle
        public static double rectangle(double length, double width) {
            return length * width;
        }

        // Method to calculate the area of a square
        public static double square(double side) {
            return side * side;
        }

        // Method to calculate the area of a circle
        public static double circle(double radius) {
            return Math.PI * radius * radius;
        }

        // Main method to get input from user and calculate area
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter shape (rectangle, square, circle): ");
            String shape = scanner.nextLine();

            if (shape.equals("rectangle")) {
                System.out.println("Enter length: ");
                double length = scanner.nextDouble();

                System.out.println("Enter width: ");
                double width = scanner.nextDouble();

                double area = rectangle(length, width);
                System.out.println("Area of rectangle: " + area);
            } else if (shape.equals("square")) {
                System.out.println("Enter side length: ");
                double side = scanner.nextDouble();

                double area = square(side);
                System.out.println("Area of square: " + area);
            } else if (shape.equals("circle")) {
                System.out.println("Enter radius: ");
                double radius = scanner.nextDouble();

                double area = circle(radius);
                System.out.println("Area of circle: " + area);
            } else {
                System.out.println("Invalid shape entered.");
            }

            scanner.close();
        }
}
