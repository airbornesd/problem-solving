package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // n1 size of Array, a1 elements of Arrays
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        // n2 size of Array, a2 elements of Arrays
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int lengthOfa3 = 0;
        if (a1.length > a2.length) {
            lengthOfa3 = a1.length + 1;
        } else {
            lengthOfa3 = a2.length + 1;
        }
        int[] a3 = new int[lengthOfa3];

        for (int )

    }
}
