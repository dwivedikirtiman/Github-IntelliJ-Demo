package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check whether the given number is prime or not");
        System.out.print("\nEnter your number: ");
        int num = input.nextInt();
        input.close();

        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {  // Handle edge cases: 0, 1, and negative numbers
            return false;
        }
        if (num == 2) {  // 2 is the only even prime number
            return true;
        }
        if (num % 2 == 0) {  // Exclude even numbers greater than 2
            return false;
        }

        int i = 3;
        while (i * i <= num) {  // Check divisibility only up to sqrt(num)
            if (num % i == 0) {
                return false;
            }
            i += 2;  // Skip even numbers
        }
        return true;
    }
}
