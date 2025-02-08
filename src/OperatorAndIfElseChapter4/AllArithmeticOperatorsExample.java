package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class AllArithmeticOperatorsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a basic demo of showing example based on Arithmetic Operators Example");
        System.out.print("Please Enter Your First Number: ");
        int number1 = input.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int number2 = input.nextInt();
        int sum = number1+number2;
        System.out.println("\nThe Addition of the given numbers are: " + sum);
        int sub = number1-number2;
        System.out.println("The Subtraction of the given numbers are: " + sub);
        int multi = number1*number2;
        System.out.println("The Multiply of the given numbers are: " + multi);
        int divide = number1/number2;
        System.out.println("The Divide of the given numbers are: " + divide);
        int modulo = number1%number2;
        System.out.println("The Modulo of the given numbers are: " + modulo);

    }

}
