package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Triangle Calculator");
        System.out.print("Enter the Base of the Triangle in cm: ");
        double base= input.nextDouble();
        System.out.print("Enter the Height of the Triangle in cm: ");
        double height= input.nextDouble();
        double area = 0.5*base*height;
        System.out.println("The Area of the triangle is: " + area +"square cm");
    }
}
