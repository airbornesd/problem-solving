package hackAssignment;

import java.util.Scanner;

public class shoppingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();


        for (int i = 1; i <= t; i++) {
            int m = scn.nextInt();
            int n = scn.nextInt();

            int aayushM = 0;
            int harshitN = 0;
            for (int j = 1; j < m + n; j++) {
                if (j % 2 == 0) {
                    if (harshitN + j <= n) {
                        harshitN = harshitN + j;
                    } else {
                        System.out.println("Aayush");
                        break;
                    }
                } else {
                    if (aayushM + j <= m) {
                        aayushM = aayushM + j;
                    } else {
                        System.out.println("Harshit");
                        break;
                    }
                }

            }

        }
    }
}
