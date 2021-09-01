package basicsofprogramming.array2d;

import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) throws Exception {
        //taking input
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //number of rows
        int m = scn.nextInt(); //number of columns
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt(); //ring number
        int r = scn.nextInt(); //number of rotations

        ringRotate(arr, s, r);
        display(arr);
    }

    public static void ringRotate(int[][] arr, int s, int r) {

        int[] la = fill1Dfrom2D(arr, s);
        rotate(la, r);
        fill2Dfrom1D(arr, la, s);

    }

    public static int[] fill1Dfrom2D(int[][] arr, int s) {
        int rMin = s - 1, cMin = s - 1, rMax = arr.length - s, cMax = arr[0].length - s;

        int size = 2 * (cMax - cMin + rMax - rMin);
        int[] arr2 = new int[size];
        int count = 0;

        //left boundary
        for (int row = rMin; row <= rMax; row++) {
            arr2[count] = arr[row][cMin];
            count++;
        }
        cMin++;

        //bottom boundary
        for (int col = cMin; col <= cMax; col++) {
            arr2[count] = arr[rMax][col];
            count++;
        }
        rMax--;

        //right boundary
        for (int row = rMax; row >= rMin; row--) {
            arr2[count] = arr[row][cMax];
            count++;
        }
        cMax--;

        //top boundary
        for (int col = cMax; col >= cMin; col--) {
            arr2[count] = arr[rMin][col];
            count++;
        }

        return arr2;
    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }

        int[] ans1 = reverse(a, 0, a.length - 1);
        ans1 = reverse(ans1, 0, k - 1);
        ans1 = reverse(ans1, k, a.length - 1);

    }

    public static int[] reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }

    public static void fill2Dfrom1D(int[][] arr, int[] la, int s) {
        int rMin = s - 1, cMin = s - 1, rMax = arr.length - s, cMax = arr[0].length - s;

        int count = 0;

        //left boundary
        for (int row = rMin; row <= rMax; row++) {
            arr[row][cMin] = la[count] ;
            count++;
        }
        cMin++;

        //bottom boundary
        for (int col = cMin; col <= cMax; col++) {
            arr[rMax][col] = la[count] ;
            count++;
        }
        rMax--;

        //right boundary
        for (int row = rMax; row >= rMin; row--) {
            arr[row][cMax] = la[count] ;
            count++;
        }
        cMax--;

        //top boundary
        for (int col = cMax; col >= cMin; col--) {
            arr[rMin][col] = la[count] ;
            count++;
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