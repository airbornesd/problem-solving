package practiceQuestions;

import java.util.Arrays;

public class question12 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    private static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                arr[i] = count;
            } else {
                count = 0;
            }
            if(count > countMax) {
                countMax = count;
            }

        }

        return countMax;
    }
}
