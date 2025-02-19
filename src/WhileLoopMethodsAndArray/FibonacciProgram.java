package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class FibonacciProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will print the Fibonacci series up to the given number of terms.");
        System.out.print("\nEnter the number of terms: ");

        int num = input.nextInt();
        input.close(); // Close Scanner to prevent resource leak

        System.out.print("The Fibonacci series up to " + num + " terms is: ");
        printFibonacci(num);
    }

    public static void printFibonacci(int num) {
        int first = 0, second = 1, i = 1;

        while (i <= num) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            i++;
        }
        System.out.println(); // Move to a new line after printing
    }
}
