package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int lowLimit = scn.nextInt();
        int highLimit = scn.nextInt();

        for (int i = lowLimit; i <= highLimit; i++) {

            int count = 0;

            for (int j = 2; j < i; j++) { // j = 1
                if (i % j == 0) {
                    count++;
                    // breaks the statement
                    break;
                }
            }

            if (count == 0) {   // count == 1
                System.out.println(i);
            }

        }
    }
}
// Brute force method; Time Complexity high
// line23: count == 0 indicates that other than all number getting output, those will be having factor more than 1
// using j * j whole time complexity getting reduce! how? don't know.