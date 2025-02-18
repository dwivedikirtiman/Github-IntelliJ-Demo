package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show the addition of the digits of the given number:");
        System.out.print("\nEnter the number: ");
        int num = input.nextInt();

        int sumOFDigits = sum(Math.abs(num));
        System.out.println("The addition of the  digits of the given number is: " +  sumOFDigits);

        }

        public static int sum(int num){
            int sumOFDigits = 0;
            int i = 1;
            while(num > 0){
                sumOFDigits = sumOFDigits + num % 10;
                num = num/10;
            }
            return sumOFDigits;
    }
}
