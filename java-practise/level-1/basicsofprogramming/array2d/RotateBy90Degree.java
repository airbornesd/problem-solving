package basicsofprogramming.array2d;

import java.util.Scanner;

public class RotateBy90Degree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        rotateBy90(a, a.length);
        display(a);
    }

    public static void rotateBy90(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        int left = 0;
        int right = n - 1;
        while (left < right) {
            for (int row = 0; row < n; row++) {
                int temp = a[row][left];
                a[row][left] = a[row][right];
                a[row][right] = temp;
            }
            left++;
            right--;
        }
    }

    public static void display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
