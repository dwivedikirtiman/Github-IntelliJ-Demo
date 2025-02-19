package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class PrintNumberFrom1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will print the number from 1 to given number");
        System.out.print("\nEnter a number: ");
        int num = input.nextInt();

    /*  int i =1;
        System.out.println("The number till the given number are: ");
        while(i <= num){
            System.out.print(i + " ");
            i++;
        }*/

        //if we don't want to write in main method directly then we can create the method as follows

        System.out.print("The numbers till the given number are: ");
        printNum(num);
    }

    public static void printNum(int num){
        int i =1;
        while(i <= num){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
