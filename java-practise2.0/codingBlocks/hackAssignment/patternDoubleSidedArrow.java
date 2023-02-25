package hackAssignment;

import java.util.Scanner;

public class patternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int spaces = n - 1;
        int spaces2 = 0;
        int starCount1 = 1;
        for (int i = 1; i <= n; i++) {
            // spaces1
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            // star 1st-half
            for (int k = starCount1; k >= 1; k--) {
                System.out.print(k + "\t");
            }
            // spaces2
            for (int j2 = 1; j2 < spaces2; j2++) {
                System.out.print("\t");
            }
            // star 2nd-half
            if (i != 1 && i != n) {
                for (int k = 1; k <= starCount1; k++) {
                    System.out.print(k + "\t");
                }
            }
            System.out.println();

            if (i <= n / 2) {
                spaces -= 2;
                spaces2 += 2;
                starCount1++;
            } else {
                spaces += 2;
                spaces2 -= 2;
                starCount1--;
            }

        }
    }
}
