package TernaryOperator;

import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check even or odd number from the given numbers");
        System.out.print("\nEnter your number: ");
        int num1 = input.nextInt();
        String result = num1 %2 == 0 ? "Even" : "Odd";
        System.out.println("The  given number is " + result);
    }
}
