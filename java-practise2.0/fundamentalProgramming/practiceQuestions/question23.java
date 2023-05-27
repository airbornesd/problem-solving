package practiceQuestions;

import java.util.Arrays;

public class question23 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        majorityElement(arr);
    }

    public static void majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);
    }


//    private static void majorityElement(int[] arr) {
//        Arrays.sort(arr);
//        int counter = 0, temper = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (temp == arr[j]) {
//                    count++;
//                }
//            }
//            if (counter < count) {
//                counter = count;
//                temper = arr[i];
//            }
//        }
//        System.out.println(temper);
//    }
}
