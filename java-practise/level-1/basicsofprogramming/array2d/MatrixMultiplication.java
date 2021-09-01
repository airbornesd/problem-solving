package basicsofprogramming.array2d;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a1 = new int[n1][m1];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                a1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a2 = new int[n2][m2];
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[0].length; j++) {
                a2[i][j] = scn.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < m1; i++) {
            int multiplicationOfIndexes = 0;
            for (int j = 0; j < n2; j++) {
                multiplicationOfIndexes = multiplicationOfIndexes + (a1[i][j] * a2[j][i]);
            }
            System.out.println(multiplicationOfIndexes);
        }


    }
}
