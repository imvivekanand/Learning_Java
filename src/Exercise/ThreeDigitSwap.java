package Exercise;

import java.util.Scanner;

public class ThreeDigitSwap {

//    Accept a three digit number from the user (100 to 999). First, check that the number has only three digits.
//    Then separate each digit of the number and then arrange them in the reverse order such that the middle digit
//    remains the same and first and third digit are swapped.
//    Example -
//    Input: 347
//    Output: 743
    public static void main(String[] args){
        int reversed = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a three digit number:");
        int threeDigitNumber = scanner.nextInt();

        if(threeDigitNumber>99 && threeDigitNumber<1000){
            System.out.println("Original Number:" + threeDigitNumber);

            for(;threeDigitNumber != 0; threeDigitNumber /= 10) {
                int digit = threeDigitNumber % 10;
                reversed = reversed * 10 + digit;
            }

            System.out.println("Reversed Number: " + reversed);

        }else {
            System.out.println("Not a three digit number.");
        }
    }
}
