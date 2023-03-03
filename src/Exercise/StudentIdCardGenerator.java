package Exercise;

import java.util.Scanner;

public class StudentIdCardGenerator {
    public static void main(String[] args){
        String name;
        int age;
        String blood;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your Blood Group: ");
        blood = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();


        System.out.println("______________________________________________");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + blood);
        System.out.println("______________________________________________");
        if(age>=20){
            System.out.println("Your group is RED");
        } else if (age>=15 && age<20){
            System.out.println("Your group is BLUE");
        } else{
            System.out.println("Your group is YELLOW");
        }
        System.out.println("______________________________________________");
    }
}
