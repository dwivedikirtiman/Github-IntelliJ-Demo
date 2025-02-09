package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class FahrenheitToCelsiusConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to temperature convertor");
        System.out.print("\nEnter your temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit -32 ) * 5 / 9;   //ideally we should write 5.0f/9.0f for floating value to avoid any kind of operation precedence erro
        System.out.println("Your Temperature in celsius is " + celsius + "C");
    }
}
