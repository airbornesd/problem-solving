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


        int sz = Math.max(n1, n2) + 1;
        int[] ans = new int[sz];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = ans.length - 1;
        int carry = 0;

        while (k >= 0) {
            int sum = carry;

            if (i >= 0){
                sum = sum + a1[i];
            }
            if (j >= 0){
                sum = sum + a2[j];
            }

            if (k < 10) {
                carry = 0;
            } else {
                carry = 1;
                sum = sum - 10;
            }
            ans[k] = sum;
            i--;
            j--;
            k--;

        }

        for (i = 0; i < ans.length; i++){
            if (i == 0 && ans[0] == 0){

            } else {
                System.out.println(ans[i]);
            }
        }


    }
}
