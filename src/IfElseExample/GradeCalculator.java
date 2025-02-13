package IfElseExample;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check the grade as per the received number in exam");
        System.out.print("\nEnter your percentage of marks:");
        float marks = input.nextFloat();
        if(marks >= 90){
            System.out.println("Great! You got Grade A");
        } else if (marks >= 75) {
            System.out.println("You got Grade B");
        }else if(marks >= 60){
            System.out.println("You got Grade C, you should work hard!");
        }else if(marks >= 30){
            System.out.println("You got Grade D, you seriously need to work hard next time!");
        }else {
            System.out.println("Sorry! You got failed in the Exam!");
        }


    }
}
