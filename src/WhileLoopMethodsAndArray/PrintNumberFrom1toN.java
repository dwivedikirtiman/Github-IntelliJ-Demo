package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class PrintNumberFrom1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will print the number from 1 to given number");
        System.out.print("\nEnter a number: ");
        int num = input.nextInt();

        int i =1;
        while(i <= num){
            System.out.print(i + " ");
            i++;
        }
    }
}
