package IfElseExample;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check greatest of three given numbers");
        System.out.print("\n Enter your First number: ");
        int First = input.nextInt();
        System.out.print("\n Enter your Second number: ");
        int Second = input.nextInt();
        System.out.print("\n Enter your Third number: ");
        int Third = input.nextInt();

        if(First >= Second && First >= Third){
            System.out.println(First +  " is the Greatest Number");
        } else if (Second >= Third) {
            System.out.println(Second + " is the Greatest Number");
        }
        else{
            System.out.println(Third + " is the Greatest Number");
        }

    }

}
