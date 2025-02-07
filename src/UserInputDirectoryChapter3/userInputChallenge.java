package UserInputDirectoryChapter3;

import java.util.Scanner;

public class userInputChallenge {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Welcome to Kg Coding Mr." +name);
    }
}
