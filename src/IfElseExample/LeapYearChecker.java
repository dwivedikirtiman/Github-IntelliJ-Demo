package IfElseExample;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check the given year is leap year or not a");
        System.out.print("\n Enter the year to check: ");
        int year = input.nextInt();
        
        if(year % 400 == 0){
            System.out.println("The given year is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("The given year is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("The given year is a leap year");
        }else{
            System.out.println("The given year is not a leap year");
        }
    }
}
