package TernaryOperator;

import java.util.Scanner;

public class MinimumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check the minimum number from the given numbers");
        System.out.print("\nEnter your first number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter your second number: ");
        int  num2 = input.nextInt();

       /* if(num1 > num2){
            System.out.println(num1 + " is the greater number");
        }else{
            System.out.println(num2 + " is the greater number");
        }*/

        //the above lines  of if else block can be removed through ternary operator as follows-

        int minResult = num1 < num2 ? num1 : num2;
        System.out.println("The minimum number is " + minResult);
    }
}
