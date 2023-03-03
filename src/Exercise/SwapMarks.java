package Exercise;

import java.util.Scanner;

public class SwapMarks {
    public static void main(String[] args){
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of a: ");
        a = scanner.nextInt();

        System.out.println("Enter the marks of b: ");
        b = scanner.nextInt();

        System.out.println("a = " + b +", " + " b = " + a);
    }
}
