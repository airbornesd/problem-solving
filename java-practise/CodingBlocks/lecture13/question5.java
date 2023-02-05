package lecture13;

// leetcode 240
// using linear search

import java.util.Scanner;

public class question5 {
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

        int target = scn.nextInt();

        if (searchMatrix(arr, target)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }

    public static boolean searchMatrix(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

}