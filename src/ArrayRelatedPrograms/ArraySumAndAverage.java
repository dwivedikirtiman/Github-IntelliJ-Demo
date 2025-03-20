//This  program will show the array sum and average

package ArrayRelatedPrograms;

import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        System.out.println("This  program will show the array sum and average ");
        int[] numArray = ArrayUtility.inputArray();

        double sum = sum(numArray);
        double average = average(numArray);
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);

    }
    public static double sum(int[] numArray){
        double sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum = sum + numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
