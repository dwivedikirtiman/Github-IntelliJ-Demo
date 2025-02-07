package UserInputDirectoryChapter3;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        System.out.println("Welcome to My Addition Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your First Number: ");
        int number1= scan.nextInt();
        System.out.print("Plesae Enter Your Second Number: ");
        int number2 = scan.nextInt();
        int sub= number1-number2;
        System.out.print("The Subtraction of the given numbers are: " + sub);
    }
}
