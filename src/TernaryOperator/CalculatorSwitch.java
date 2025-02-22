package TernaryOperator;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate the expression value with the help of switch");
        System.out.print("\nEnter your first number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter your second number: ");
        int num2 = input.nextInt();
        System.out.print("\nNow, enter the operation you want: ");
        String operator = input.next();

        int result = switch(operator){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" ->  num1 * num2;
            case "/" -> num1/num2;
            default -> 1;
        };
        System.out.println("Your answer is " + result);
    }
}
