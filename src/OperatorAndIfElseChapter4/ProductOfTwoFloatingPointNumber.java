package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class ProductOfTwoFloatingPointNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a demo example of floating point numbers");
        System.out.print("Enter Your First Floating Number: ");
        float number1= input.nextFloat();
        System.out.print("Enter Your Second Floating Number: ");
        float number2 = input.nextFloat();
        float product_result= number1*number2;
        System.out.println("The Product of these  two floating number is: " + product_result);

    }
}
