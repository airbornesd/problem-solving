package gettingStarted;

import java.util.Scanner;

public class printPrimeTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    // for more time optimisation
                    // time exactly halved
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
//            for (int j = 1; j < i / 2; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if (count <= 1) {
//                System.out.println(i);
//            }
        }

    }
}
