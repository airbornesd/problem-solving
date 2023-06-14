package questions;

import java.util.ArrayList;
import java.util.Collections;

public class question020 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {2, 2, 3, 4, 5};
        int m = 5;
        int[] arr2 = {1, 1, 2, 3, 4};
        findUnion(arr1, arr2, n, m);
    }

    public static void findUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> arrL = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrL.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            arrL.add(arr2[i]);
        }

        Collections.sort(arrL);
        duplicate(arrL);
    }

    private static void duplicate(ArrayList<Integer> arrL) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arrL.get(0));

        for (int i = 1; i < arrL.size(); i++) {
            // as arraylist is a collection framework therefore .equals will be used
            // because of heap allocation
            // or else address will get compared instead of elements
            if (!arrL.get(i).equals(arrL.get(i - 1))) {
                result.add(arrL.get(i));
            }
        }

        System.out.println(result);
    }
}
