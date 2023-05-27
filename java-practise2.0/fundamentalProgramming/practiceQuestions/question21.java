package practiceQuestions;

import java.util.Arrays;

public class question21 {
    public static void main(String[] args) {
        int n = 5;
        //int[] arr = {-4, -1, 0, 3, 10};
        int[] arr = {1, 2, 3, 4, 5};
        runningSquare(arr, n);
    }

    private static void runningSquare(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }
        sortArr(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
