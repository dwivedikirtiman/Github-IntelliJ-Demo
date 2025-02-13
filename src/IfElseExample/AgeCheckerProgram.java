package IfElseExample;

import java.util.Scanner;

public class AgeCheckerProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program that will check your age");
        System.out.print("\nEnter you Age here: ");
        int age = input.nextInt();

       /* if(age >= 60){
            System.out.println("You are a senior Citizen");
        } else if (age >= 20 && age < 60) {
            System.out.println("you are an adult");
        } else if (age >13 && age <20) {
            System.out.println("you are a teen");
        }else{
            System.out.println("you are a child");
        }*/

        //Alternate way to write the same

        if(age >= 65){
            System.out.println("You are a senior Citizen");
        } else if (age >= 20) {
            System.out.println("you are an adult");
        } else if (age >= 13) {
            System.out.println("you are a teenager");
        }else{
            System.out.println("you are a child");
        }

    }
}
