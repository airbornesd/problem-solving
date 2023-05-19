package practiceQuestions;

import java.util.Scanner;

// subarray
public class question15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scn.nextInt();
            }
            System.out.println(maxSubarraySum(arr));
        }
    }

    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            for (int j = 0; j < n; j++) {
                int index = (i + j) % n;
                currentSum += arr[index];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                }
            }
        }

        return maxSum;
    }

}