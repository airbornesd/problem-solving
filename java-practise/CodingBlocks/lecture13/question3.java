package lecture13;

// wave print in 2d array

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        Display(arr);
    }

    public static void Display(int[][] arr) {

        for (int col = 0; col < arr[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }

        }
        System.out.println();

    }
}