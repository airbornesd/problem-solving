package questions;

import java.util.ArrayList;

public class question018 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5};
        int n = arr.length;
        duplicate(arr, n);
    }

    private static void duplicate(int[] arr, int n) {
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arrL.add(arr[i]);
            }
        }
        System.out.println(arrL);
    }
}
