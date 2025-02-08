package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a simple interest calculator\n");
        System.out.print("Please Enter your principal amount in Rs: ");
        int pa=input.nextInt();
        System.out.print("Now, Enter your rate of interest: ");
        float ratio=input.nextFloat();
        System.out.print("Enter time in  years here: ");
        float years = input.nextFloat();

        float simple_interest = (pa * ratio * years)/100;
        System.out.println("\n\nThe  simple interest for this in Rs. is: " + simple_interest);

    }
}
