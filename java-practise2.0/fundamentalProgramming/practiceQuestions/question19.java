package practiceQuestions;

// https://leetcode.com/problems/sort-colors/description/

import java.util.Arrays;
import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort(arr, n);
    }

    private static void sort(int[] arr, int n) {
        int[] arr1 = new int[n];
        int count = 0;
        int j = 0;
        while (count < 3) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == count) {
                    arr1[j] = arr[i];
                    j++;
                }
            }
            count++;
        }

        System.out.println(Arrays.toString(arr1));
    }
}