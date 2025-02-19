package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check whether the given number is  palindrome or not ");
        System.out.print("\nEnter the number: ");
        int num = input.nextInt();
        input.close();

        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Given number is a palindrome number");
        } else {
            System.out.println("Given number is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int num) {
        /*int reverse = reverseNum(num);
        return num == reverse;*/
        return num == reverseNum(num);
    }

    public static int reverseNum(int num) {
        int newNum = 0;
        boolean isNegative = num < 0; // Check if the number is negative
        num = Math.abs(num);
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;

        }
        return newNum;
    }
}
