package hackAssignment;

import java.util.Scanner;

public class inverseOfAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        inverse(arr, arr.length);

    }

    public static void inverse(int[] arr, int n) {

        int[] inverseArray = new int[n];
        for (int i = 0; i < n; i++) {
            int inv = arr[i];
            inverseArray[inv] = i;
        }

        for (int value : inverseArray) {
            System.out.print(value + " ");
        }
    }
}
