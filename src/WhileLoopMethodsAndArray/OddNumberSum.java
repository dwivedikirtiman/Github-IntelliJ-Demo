//This program will sum all the odd numbers till the given number by the user

package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will sum all the odd numbers till the given number by the user");
        System.out.print("\nEnter your number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("The addition of the odd number till " + num + " is " +  sum);
    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i += 2;
        }
        return sum;
    }
}
