package functionAndArrays;

import java.util.Scanner;

public class sumOfTwoArray {
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
        int[] arr3 = new int[Math.max(n1, n2)];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr3.length - 1;

        int carry = 0;
        while (k >= 0) {
            int digit = carry;
            if(i >= 0) {
                digit += arr1[i];
            }
            if(j >= 0) {
                digit += arr2[j];
            }
            carry = digit / 10;
            digit = digit % 10;
            arr3[k] = digit;
//            if (i >= 0 || j >= 0) {
//                arr3[k] = arr1[i] + arr2[j] + carry;
//            }
//            carry = arr3[i] / 10;
//            if (arr3[i] >= 10) {
//                arr3[i] = arr3[i] % 10;
//            }
//            System.out.println(arr3[k]);
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.println(carry);
        }

        for (int value : arr3) {
            System.out.println(value);
        }


//        int j = arr2.length - 1;
//        int carry = 0;
//        for (int i = arr3.length - 1; i >= 0; i--) {
//            if (j < 0) {
//                arr2[j] = 0;
//            }
//            arr3[i] = arr1[i] + arr2[j] + carry;
//            carry = arr3[i] / 10;
//            if (arr3[i] >= 10) {
//                arr3[i] = arr3[i] % 10;
//            }
//            System.out.println(arr3[i]);
//            j--;
//
//        }
    }
}
