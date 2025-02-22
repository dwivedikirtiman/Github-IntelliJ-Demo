package TernaryOperator;

import java.util.Scanner;

public class StudentScoresCategoryByTernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will tell the category of students based on their marks");
        System.out.print("\n Please enter your marks: ");
        int marks = input.nextInt();

        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your category is "+ category);
    }
}
