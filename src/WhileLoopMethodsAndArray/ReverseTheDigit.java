package WhileLoopMethodsAndArray;

import java.util.Scanner;

public class ReverseTheDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This  program will reverse the digit of the given number");
        System.out.print("\nEnter the  number: ");
        int num = input.nextInt();
        input.close();


        int reverseNum = reverseNum(num);
        System.out.println("The reverse of this number is : " + reverseNum);
    }

    public static int reverseNum(int num){
        int newNum=0;
        boolean isNegative = num < 0; // Check if the number is negative
        num = Math.abs(num);
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num/10;

        }
        return isNegative ? -newNum : newNum; // Restore negative sign if needed

        //the same above ternary operator can be written as follows or can be written in one line as above

        /*if (isNegative) {
            return -newNum;
        } else {
            return newNum;
        }*/
    }
}
