package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int c = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(c + "\t");
                int cSeries = c * (i - j) / (j + 1);
                c = cSeries;
            }
            System.out.println();
        }
    }
}
