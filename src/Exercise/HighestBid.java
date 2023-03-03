package Exercise;

import java.util.Scanner;

public class HighestBid {
    public static void main(String[] args){
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you bid for a Harry Potter antique broomstick: ");
        System.out.println("Bid of a");
        a = scanner.nextInt();

        System.out.println("Bid of b");
        b = scanner.nextInt();

        System.out.println("Bid of c");
        c = scanner.nextInt();

        if(a>b && a>c){
            System.out.println("Winner is a with the highest bid of: " + a);
        }else if(b>a && b>c){
            System.out.println("Winner is b with the highest bid of: " + b);

        } else{
            System.out.println("Winner is c with the highest bid of: " + c);
        }
    }
}
