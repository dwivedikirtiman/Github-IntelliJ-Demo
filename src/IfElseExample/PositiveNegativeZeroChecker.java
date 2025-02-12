package IfElseExample;

import java.util.Scanner;

public class PositiveNegativeZeroChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check whether the given number is positive or negative");
        System.out.println("\nEnter your number to check: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("The given number is positive");
        } else if (number == 0) {
            System.out.println("You have enter Zero");

        } else
            System.out.println("The given number is negative");

    }

}