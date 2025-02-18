package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check whether the given number is prime or not");
        System.out.print("\nEnter your number: ");
        int num = input.nextInt();

        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Your number is prime");
        }else{
            System.out.println("Your number is not prime");
        }
    }

    public static boolean isPrime(int num){
        int i =2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;

    }
}
