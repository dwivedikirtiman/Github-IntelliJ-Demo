package TernaryOperator;

import java.util.Scanner;

public class SwitchTypeTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show the implementation of enhanced switch case");
        System.out.print("\nEnter the day: ");
        int day = input.nextInt();

        //oldSwitch(day);         //switch type one
        newSwitch(day);         //switch type two or enhanced switch introduced in java 12 and afterwards
    }

    public static void oldSwitch(int day){
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;                            //if we don't put break then it will go to next condition it is called fall through of switch casing as i'm falling through one condition and going to next condition directly without break
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number, please enter your number between 1 to 7");
        }

    }
    public static void newSwitch(int dayof){
        String dayString= switch(dayof){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
           /* case 6 -> "Saturday";
            case 7 -> "Sunday";*/

            //if we want to print multiple condition to be true in one case then we can write it as follows-


            case 6, 7 -> "Holiday";

            default -> "Invalid";

        };
        System.out.println(dayString);


    }
}
