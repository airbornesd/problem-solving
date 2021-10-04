package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t >= 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }

//            int max = arr[0];
//            for (int k : arr) {
//                if (k > max) {
//                    max = k;
//                }
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[i] < max) {
//                        arr[i] = max;
//                        break;
//                    }
//                }
//            }

            // to be completed


            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
            t--;
        }
    }
}
