package questions;

import java.util.Arrays;

public class question016 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 3, 1};
        int n = arr.length;
        System.out.println(Arrays.toString(inverse(arr, n)));
    }

    private static int[] inverse(int[] arr, int n) {
        int[] inv = new int[n];
        for (int i = 0; i < n; i++) {
            int j = arr[i];
            inv[i] = arr[j];
        }
        return inv;
    }
}