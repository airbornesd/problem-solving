package questions;

import java.util.ArrayList;

public class question5 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 3, 5};
        int n = arr.length;
        System.out.println(inversePermutation(arr, n));
    }

    public static ArrayList<Integer> inversePermutation(int[] arr, int n) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int j = arr[i];
            arr2[j - 1] = i + 1;
        }
        for (int j : arr2) {
            num.add(j);
        }

        return num;

    }

}
