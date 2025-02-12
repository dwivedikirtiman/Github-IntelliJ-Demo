package IfElseExample;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a simple odd even checker program");
        System.out.print("\nEnter your number to check: ");
        /*int  number = input.nextInt();
        if((number/2) == (int)(number/2)){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }*/
        //method 1 is this and method 2 is as follows:

        /*int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }*/

        //Another Method

        if (input.hasNextInt()) {  // Ensures the input is an integer
            int num = input.nextInt();
            if ((num / 2) * 2 == num) { // Checking divisibility by 2
                System.out.println(num + " is Even.");
            } else {
                System.out.println(num + " is Odd.");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
