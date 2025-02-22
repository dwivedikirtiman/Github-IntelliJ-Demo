package TernaryOperator;

import java.util.Scanner;

public class SwitchTypeOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show the work of Switch ternary operator");
        System.out.print("\nEnter your day in number: ");
        int day = input.nextInt();


        //we can write this inside a method also for a clear readability as follows-
       /* switch(day){
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
                //break;                            //if we don't put break then it will go to next condition it is called fall through of switch casing as i'm falling through one condition and going to next condition directly without break
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number, please enter your number between 1 to 7");
        }*/

        String displayDay = getDayName(day);
        System.out.println("The day is "+ displayDay);

    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            // No break needed here—return exits the method
            case 7:
                return "Sunday";
            default:
                return "Invalid number, please enter your number between 1 to 7";
        }
    }
}
