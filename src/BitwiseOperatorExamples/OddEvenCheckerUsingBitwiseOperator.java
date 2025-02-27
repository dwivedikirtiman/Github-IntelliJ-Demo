//This program will check Even or Odd numbers using Bitwise Operator

package BitwiseOperatorExamples;

import java.util.Scanner;

public class OddEvenCheckerUsingBitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check using Bitwise Operator");
        System.out.print("\nEnter your number: ");
        int number = input.nextInt();

        if((number & 1) == 1){
            System.out.println("The number is odd");
        }else{
            System.out.println("The number is even");
        }
    }
}
