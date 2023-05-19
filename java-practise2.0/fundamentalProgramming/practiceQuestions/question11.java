package practiceQuestions;

import java.util.Arrays;

public class question11 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 8, 1};
        System.out.println(missingNumber(arr, n));
    }

    private static int missingNumber(int[] arr, int n) {
        Arrays.sort(arr);

        if (arr[0] != 0) return 0;

        int x = n - 2;

        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
                return temp;
            }
            temp = arr[i] + 1;
        }

        return arr[x - 1] + 1;

    }
}
