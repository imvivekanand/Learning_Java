import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {

        String name;
        int population;
        float populationDensity; //Float should end with f or F.
        double GDP;
        char currency; //char datatype can only have single text, number or symbol wrapped with single quote.
        boolean isSeqular;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your country name:");
//        name = scanner.next();
        name = scanner.nextLine();  //nextLine method is used to read the whole line whereas next method is used to read only one word.

        System.out.println("Enter Population: ");
        population = scanner.nextInt();

        System.out.println("Enter the population density: ");
        populationDensity = scanner.nextFloat();

        System.out.println("Enter the GDP: ");
        GDP = scanner.nextDouble();

        System.out.println("Enter currency symbol: ");
        currency = scanner.next().charAt(0);

        System.out.println("Enter currency symbol: ");


        System.out.println("User is from " + name);
        System.out.println("The population of the country is " + population);
        System.out.println("The population of the country is " + population);
        System.out.println("The population of the country is " + population);
        System.out.println("The population of the country is " + population);



        scanner.close();
    }
}
