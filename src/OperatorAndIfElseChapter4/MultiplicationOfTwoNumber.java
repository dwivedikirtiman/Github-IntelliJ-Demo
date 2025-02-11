package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class MultiplicationOfTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a simple a example of multiplication of two numbers");
        System.out.print("\nEnter your first number: ");
        double a = input.nextDouble();
        System.out.print("Enter your second number: ");
        double b = input.nextDouble();
        double c = a * b;
        System.out.println("The multiplication of the given number is " + c);
    }
}
