package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class MultiplicationTableOfGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will print the multiplication table of the given number");
        System.out.print("\nEnter your number: ");
        int num = input.nextInt();
        printMultiplicationOfTheNumber(num);

//        int i =1;
//        while(i <= 10){
//            System.out.println(num + " X " + i + " = " + (num * i));
//            i++;

        //The same thing we can do through the help of method/function as follows
        }

    public static void printMultiplicationOfTheNumber(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + "X" + i + " = " + (num * i));
            i++;
        }

    }

}
