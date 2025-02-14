package BitwiseOperatorExamples;

import java.util.Scanner;

//also known as bitwise compliment operator or bitwise NOT operator

public class BitwiseNotOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show Bitwise NOT operator");
        System.out.print("\nEnter your number: ");
        int first = input.nextInt();

        int result = ~first;
        System.out.println("The Bitwise NOT/Compliment operation for the given number is " + result);
    }
}
