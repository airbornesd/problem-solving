package functionAndArrays;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
            if (arr[i] > maxSize) {
                maxSize = arr[i];
            }
        }


        for (int i = maxSize; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }
}
