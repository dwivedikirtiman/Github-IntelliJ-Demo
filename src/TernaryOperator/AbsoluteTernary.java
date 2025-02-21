package TernaryOperator;

import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show absolute number");
        System.out.print("\nEnter your number: ");
        int num1 = input.nextInt();
        int result = num1 >=0 ? num1 : -num1;
        System.out.println("The  absolute of the given number is " + result);
    }
}
