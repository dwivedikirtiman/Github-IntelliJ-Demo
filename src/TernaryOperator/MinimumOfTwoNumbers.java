package TernaryOperator;

import java.util.Scanner;

public class MinimumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check the minimum number from the given numbers");
        System.out.print("\nEnter your first number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter your second number: ");
        int  num2 = input.nextInt();

       /* if(num1 > num2){
            System.out.println(num1 + " is the greater number");
        }else{
            System.out.println(num2 + " is the greater number");
        }*/

        //the above lines  of if else block can be removed through ternary operator as follows-

       /* int minResult = num1 < num2 ? num1 : num2;
        System.out.println("The minimum number is " + minResult);*/

        //as we have used ternary operator above but we can and we should always put all this in a method so
        //this all can be written under a method  as follows:

        MinimumOfTwoNumbers minTwo = new MinimumOfTwoNumbers();  //object creation of the class to access teh method as method is not static
        int minResult = minTwo.minMethod(num1, num2);  //agar mera method static declare rehta to ye error nahi deta but kyuki ye
                                                    // static nahi declare hai to abhi mujhe apne class ka object banana padega and then through that object i can access the method which i've created
        System.out.println("The minimum number is " + minResult);
    }

    public int minMethod(int num1, int num2){
        return num1 < num2 ? num1 : num2;
       /* if(num1 < num2){
            return num1;
        }else{
            return num2;
        }*/
    }
}
