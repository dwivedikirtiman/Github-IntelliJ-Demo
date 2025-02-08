package OperatorAndIfElseChapter4;

import java.util.Scanner;

public class PerimeterOfARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a demo example which will show perimeter of a rectangle");
        System.out.println("Enter all four sides of your  rectangle here in CM: ");
        double a = input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        double  d = input.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("The perimeter for  this rectangle is " + perimeter + "CM");
    }
}
