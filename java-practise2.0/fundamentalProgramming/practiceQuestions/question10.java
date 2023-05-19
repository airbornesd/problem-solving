package practiceQuestions;

import java.util.Arrays;

public class question10 {
    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = {3, 5, 0, 0, 4};
        int n = 4;
        int[] arr = {0, 0, 0, 4};
//        int n = 4;
//        int[] arr = {1, 0, 0, 0};
//        int n = 20;
//        int[] arr = {15, 12, 0, 0, 0, 2, 2, 19, 6, 17, 16, 20, 0, 2, 16, 0, 10, 0, 14, 15};
        pushZerosToEnd(arr, n);

    }

    private static void pushZerosToEnd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < n) {
            arr[count] = 0;
            count++;
        }

        System.out.println(Arrays.toString(arr));
    }

}
