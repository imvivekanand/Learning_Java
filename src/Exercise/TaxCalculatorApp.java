package Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaxCalculatorApp {
    public static void main(String[] args){
        System.out.println("Tax Calculator App");
        System.out.println("-----WELCOME-----");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total number of persons:");
        int personCount = scanner.nextInt();

        String[] names = new String[personCount];
        long[] income = new long[personCount];

        for(int count = 1; count<=personCount; count++){
            System.out.println("Enter name " + count);
            names[count-1] = scanner.nextLine();

            System.out.println("Enter " + (names[count-1]) + " Annual Income:");
            income[count-1] = scanner.nextLong();

        }

        System.out.println(names);
        System.out.println(income);



    }
}
