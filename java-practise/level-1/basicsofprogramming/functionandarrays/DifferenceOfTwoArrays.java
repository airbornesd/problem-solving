package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
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

        int[] a1New = new int[n2];
        if (a1.length < a2.length) {
            a1New = additionOfNewArr(a1, n2);
        } else {
            a1New = a1.clone();
        }

        int[] diff = new int[n2];
        int i = a2.length - 1;
        int j = a1New.length - 1;
        int k = diff.length - 1;
        int carry = 0;

        while (k >= 0) {
            int substationOfNum = carry + a2[j];

            if (i >= 0) {
                substationOfNum = substationOfNum - a1New[i];
            }

            if (substationOfNum < 0) {
                substationOfNum = substationOfNum + 10;
                carry = -1;
            } else {
                carry = 0;
            }

            diff[k] = substationOfNum;
            i--;
            j--;
            k--;
        }


        i = 0;
        while (diff[i] == 0) {
            i++;
        }

        for (; i < diff.length; i++) {
            System.out.println(diff[i]);
        }

    }

    public static int[] additionOfNewArr(int[] a1, int n2) {

        int[] ans = new int[n2];

        int i = a1.length - 1;
        int k = ans.length - 1;

        while (k >= 0) {
            int sum = 0;

            if (i >= 0) {
                sum = sum + a1[i];
            }

            ans[k] = sum;
            i--;
            k--;

        }

        return ans;


    }

}
