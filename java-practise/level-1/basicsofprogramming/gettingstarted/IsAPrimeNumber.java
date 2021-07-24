package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class IsAPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int inputNumberOfTime = scn.nextInt();

        // To take input from user number of times and loop j number of times:
        for (int j = 0; j < inputNumberOfTime; j++) {

            int t = scn.nextInt();
            int i = 1;
            int x = 0;

            for (i = 1; i <= t; i++) {
                if (t % i == 0) {
                    // x will find out no.of time output that will be generated
                    x++;
                }
            }

            if ( x > 2 || t == 0 || t == 1) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }

        }

    }
}

/*
            if (x == 2 || x == 1) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}
 */