package basicsofprogramming.array2d;

import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();

        int rMin = arr[(s - 1)][(s - 1)], cMin = arr[(n - s)][(s - 1)], rMax = arr[(s - 1)][(m - s)], cMax = arr[(n - s)][(m - s)];
        System.out.println(rMin + " " + cMin + " " + rMax + " " + cMax);
        System.out.println();
        int count = 0;
        int[] arr2 = new int[m * n];
        while (count < n * m) {
            //left boundary
            for (int row = rMin; row <= rMax; row++) {
                System.out.println(row);
                //arr2[count] = arr[row][cMin];
                //System.out.println(arr[row][cMin]);
                count++;
            }

            //bottom boundary
            for (int col = cMin; col <= cMax; col++) {
                System.out.println(col);
                //arr2[count] = arr[rMax][col];
                //System.out.println(arr[rMax][col]);
                count++;
            }

            //right boundary
            for (int row = rMax; row >= rMin; row--) {
                System.out.println(row);
                //arr2[count] = arr[row][cMax];
                //System.out.println(arr[row][cMax]);
                count++;
            }

            //top boundary
            for (int col = cMax; col >= cMin; col--) {
                System.out.println(col + " hehe");
                //arr2[count] = arr[rMin][col];
                //System.out.println(arr[rMin][col]);
                count++;
            }
        }

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}