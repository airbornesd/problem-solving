package basicsofprogramming.array2d;

import java.util.Scanner;

public class TheStateOfWakanda2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        for (int count = 0; count < a.length; count++) {
            int j = count;
            for (int i = 0; i < a.length - count; i++) {
                System.out.println(a[i][j]);
                j++;
            }
        }

    }
}