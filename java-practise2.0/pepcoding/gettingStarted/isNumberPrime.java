package gettingStarted;

import java.util.Scanner;

public class isNumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        // prime numbers: number that divides by one or by itself
        for (int i = 0; i < t; i++) {
            int prime = scn.nextInt();
            int count = 0;

            // for better time optimisation we are dividing number of loop by 2
            // bcoz after divide the number by 2 it doesn't make sense to carry on extra loop which will always be resulting
            // in not useful value
            for (int j = 1; j <= prime / 2; j++) {
                // for better optimise code use:
                // (int j = 2; j * j <= prime; j++)

                // we are mod so,
                // 7 mod 1 = 0 || 7 mod 2 = 1 || 7 mod 3 = 1 || 7 mod 4 = 3
                // 7 mod 5 = 2 || 7 mod 6 == 1 || 7 mod 7 == 0
                // so mod operation returns the remainder
                if (prime % j == 0) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }
        }
    }
}
