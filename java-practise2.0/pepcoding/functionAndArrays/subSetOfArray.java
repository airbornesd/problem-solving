package functionAndArrays;

import java.util.Scanner;

public class subSetOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        subSet(arr);
    }

    public static void subSet(int[] arr) {

        int n = (int) Math.pow(2, arr.length);
        for (int j = 0; j < n; j++) {
            for (int k = arr.length - 1; k >= 0; k--) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }

}