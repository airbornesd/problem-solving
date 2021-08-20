package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class SubarrayProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of element in the array
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        // si = starting index
        // ei = end index
        for (int si = 0; si < a.length; si++) {
            for (int ei = si; ei < a.length; ei++) {
                for (int i = si; i <= ei; i++) {
                    System.out.print(a[i] + "\t");
                }
                System.out.println();
            }
        }

    }
}
