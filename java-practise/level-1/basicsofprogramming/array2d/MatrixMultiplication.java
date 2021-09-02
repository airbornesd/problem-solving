package basicsofprogramming.array2d;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        {
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

            if (m1 != n2) {
                System.out.println("Invalid input");
            } else {
                int[][] prd = new int[n1][m2];
                int n1Count = 0;
                while (n1Count < n1) {
                    for (int i = 0; i < m2; i++) {
                        int multiplicationOfIndexes = 0;
                        for (int j = 0; j < n2; j++) {
                            multiplicationOfIndexes = multiplicationOfIndexes + (a1[n1Count][j] * a2[j][i]);
                        }
                        prd[n1Count][i] = multiplicationOfIndexes;
                    }
                    n1Count++;
                }
                for (int i = 0; i < prd.length; i++) {
                    for (int j = 0; j < prd[0].length; j++) {
                        System.out.print(prd[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
