package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int lowLimit = scn.nextInt();
        int highLimit = scn.nextInt();
        int count = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + "  " + j);

                    count++;
                    System.out.println(count + " -count");
                }

            }
            System.out.println("count should be: " + count);
            if (count > 2 || count == 1 || count == 0) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }
        }
    }
}