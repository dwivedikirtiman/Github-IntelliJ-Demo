package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class SwapProgramChallenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Swapping Station\n");
        System.out.print("Please Enter Value of A: ");
        int A = input.nextInt();
        System.out.print("Please Enter Value of B: ");
        int B = input.nextInt();

        int C= A;
        A = B;
        B = C;

        System.out.println("Swapping Done for the given numbers....");
        System.out.println("Now, Value of A  after swapping is: " + A);
        System.out.println("Value of B after swapping is: " + B);
    }
}
