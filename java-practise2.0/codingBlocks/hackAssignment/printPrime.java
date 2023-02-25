package hackAssignment;

import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count < 2) {
                System.out.println(i);
            }

        }
    }
}
