package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class CalculateCompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a simple Compound Interest Calculator: ");
        System.out.print("\nPlease Enter your principal amount in Rs: ");
        int pa=input.nextInt();
        System.out.print("Now, Enter your rate of interest: ");
        float ratio=input.nextFloat();
        System.out.print("Enter time in  years here: ");
        float years = input.nextFloat();

        double final_amount = pa * Math.pow((1 + ratio / 100), years);

        double compound_interest = final_amount - pa;
        System.out.println("Your Compound Interest is: " +  compound_interest);
    }
}
