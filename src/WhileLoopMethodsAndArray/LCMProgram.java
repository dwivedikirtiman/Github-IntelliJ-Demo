//This program will show the LCM of the numbers provided

package WhileLoopMethodsAndArray;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LCMProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show the LCM of the numbers provided");
        System.out.print("\nEnter the  First number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter the  Second number: ");
        int num2  = input.nextInt();

        int LCM = lcm(num1, num2);
        System.out.println("LCM of the given two number is: " + LCM);
    }

    public static int lcm(int num1, int num2){
        int i =1;
        while(true){   //while true will flow the loop till the lcm will be found until then the value of i wil iterate
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }

    }
}
