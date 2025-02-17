package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show the factorial of the given number");
        System.out.print("\nEnter the number: ");
        int num = input.nextInt();
        long factorial = factorialOfNumber(num);
        System.out.println("The factorial of "+ num + " is " +  factorial);
    }

    public static long factorialOfNumber(int num){

        if(num < 2){
            return 1;
        }

        long factorial = 1;
        int i = 2;

        while(i <= num){
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }
}
