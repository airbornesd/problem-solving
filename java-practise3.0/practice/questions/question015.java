package questions;

import java.util.Arrays;

public class question015 {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr = {1, 2};
        int k = 3;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }

    public static int[] rotate(int[] arr, int k) {

        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        return arr;
    }

    private static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}

