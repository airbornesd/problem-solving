package hackAssignment;

import java.util.Scanner;

public class arraysReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        reverse(arr, arr.length);

    }

    public static void reverse(int[] arr, int n) {

        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int value : arr) {
            System.out.print(value);
        }

    }
}