package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class PrintAllPrimesTillN2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int lowLimit = scn.nextInt();
        int highLimit = scn.nextInt();

        for (int i = lowLimit; i <= highLimit; i++) {

            int count = 0;

            // why 2? because, 1 is factor of every number.
            // what i used(only diff): for (int j = 2; j < i; j++)
            // by using this statement time complexity gets reduce
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    // Using Break statement ends the loop as early condition get false
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }

        }
    }
}