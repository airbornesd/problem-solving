package practiceQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class question14 {
    public static void main(String[] args) {

//        int n = 5;
//        int m = 5;
//        int[] arr1 = {2, 2, 2, 2, 2};
//        int[] arr2 = {1, 1, 1, 1, 1};
        int n = 2;
        int m = 8;
        int[] arr1 = {1, 35};
        int[] arr2 = {6, 9, 13, 15, 20, 25, 29, 46};
        if (m > n) {
            System.out.println("hi");
            System.out.println(findUnion(arr2, arr1, m, n));
        } else {
            System.out.println("bye");
            System.out.println(findUnion(arr1, arr2, n, m));
        }
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        int[] arr = new int[n + m];

        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < m; i++) {
            arr[n + i] = arr2[i];
        }

        Arrays.sort(arr);

        removeDuplicateElements(arr, arr.length);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list2.add(arr[i]);
            if (arr[i + 1] < arr[i]) break;
        }
        return list2;
    }

    public static void removeDuplicateElements(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return;
        }
        int j = 0;//for next element
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
    }
}
