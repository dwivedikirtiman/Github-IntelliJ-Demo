package BitwiseOperatorExamples;

import java.util.Scanner;

public class BitwiseLeftShiftOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show Bitwise Left Shift operator");
        System.out.print("\nEnter your number: ");
        int first = input.nextInt();

        int result = first << 1;
        System.out.println("The Bitwise Left Shift operation for the given number is " + result);
    }
}
