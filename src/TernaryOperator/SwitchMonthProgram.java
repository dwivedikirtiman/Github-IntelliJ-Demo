package TernaryOperator;

import java.util.Scanner;

public class SwitchMonthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will use switch to print the name of the month");
        System.out.print("\nEnter your number: ");
        int month = input.nextInt();

        String myMonth = getMyMonth(month);
        System.out.println("The name of the month is "+ myMonth);


    }

    public static String getMyMonth(int monthName){
        return switch (monthName){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Number, please enter a valid number from 1 to 12";
        };
    }
}
