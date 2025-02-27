//This program will show Bitwise Right Shift operator

package BitwiseOperatorExamples;

import java.util.Scanner;

public class BitwiseRightShiftOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show Bitwise Right Shift operator");
        System.out.print("\nEnter your number: ");
        int first = input.nextInt();

        int result = first >> 1;
        System.out.println("The Bitwise Right Shift operation for the given number is " + result);
    }
}

