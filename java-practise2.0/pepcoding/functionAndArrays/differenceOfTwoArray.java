package functionAndArrays;

import java.util.Scanner;

public class differenceOfTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
        int size3 = arr2.length;

        int i = arr1.length - 1; // smaller
        int j = arr2.length - 1; // bigger
        int[] arr3 = new int[size3];
        int k = arr3.length - 1;

        int carry = 0;
        while (k >= 0) {
            int jValue = 0;
            int iValue = 0;
            int kValue = 0;
            if (j >= 0) {
                jValue = arr2[j] + carry;
            }
            if (i >= 0) {
                iValue = arr1[i];
            }

            if (jValue < iValue) {
                jValue = jValue + 10;
                kValue = jValue - iValue;
                carry = -1;
            } else {
                kValue = jValue - iValue;
                carry = 0;
            }

            arr3[k] = kValue;

            i--;
            j--;
            k--;

        }

        int z = 0;
        while (z < arr3.length) {
            if (arr3[z] == 0) {
                z++;
            } else {
                break;
            }
        }

        while (z < arr3.length) {
            System.out.println(arr3[z]);
            z++;
        }
    }
}
/* for value of iValue we can also do like
    int iValue = arr[i] >= 0 ? a1[i] : 0;
    for -ve value of i;

 */