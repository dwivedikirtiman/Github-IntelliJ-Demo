package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check whether the given number is an Armstrong number or not.");
        System.out.print("\nEnter a number: ");
        int num = input.nextInt();
        input.close(); // Close Scanner to prevent resource leak

        if (num < 0) { // Negative numbers can't be Armstrong numbers
            System.out.println("Please enter a positive number.");
        } else {
            boolean isArmstrong = checkArmstrong(num);
            if (isArmstrong) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is NOT an Armstrong number.");
            }
        }
    }

    public static boolean checkArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = countDigits(num); // Count the number of digits

        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            sum += power(digit, digits); // Use custom power function
            num /= 10; // Remove the last digit
        }

        return sum == originalNum; // Return true if sum matches the original number
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10; // Remove last digit
            count++; // Increase count
        }
        return count;
    }

    // Custom method to calculate power (base^exp) without using Math.pow()
    public static int power(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            result *= base;
            exp--;
        }
        return result;
    }
}
