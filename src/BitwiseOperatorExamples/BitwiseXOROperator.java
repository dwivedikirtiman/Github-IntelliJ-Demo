//This program will show Bitwise XOR operator

package BitwiseOperatorExamples;

import java.util.Scanner;

public class BitwiseXOROperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show Bitwise XOR operator");
        System.out.print("\nEnter your first number: ");
        int first = input.nextInt();
        System.out.print("\nEnter your second number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("The Bitwise XOR operation for the given number is " + result);
    }
}
