#This program will find the GCD of the given numbers

package WhileLoopMethodsAndArray;
import java.util.Scanner;

public class GCDProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will find the GCD of the given numbers");
        System.out.print("\nEnter the first number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter the Second number: ");
        int num2 = input.nextInt();

        int gcd = gcd(num1, num2);
        System.out.println("The GCD for the given numbers is: " + gcd);
    }

    public static int gcd(int num1, int num2) {
        int gcd = 1; // Default GCD is 1 (minimum possible)
        int least = Math.min(num1, num2); // Find the smaller number
        int i =1;
        while(i <= least){
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Keep updating GCD to the largest divisor found
            }
            i++;
        }
        return gcd; // Return the largest common divisor
    }
}
