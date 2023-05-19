package practiceQuestions;

import java.util.*;

public class question9 {
    public static void main(String[] args) {
        int n = 6;
        int k = 12;
        int[] arr = {1, 2, 3, 4, 5, 6};
        leftRotate(arr, k, n);
    }

    static void leftRotate(int[] arr, int k, int n) {
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
