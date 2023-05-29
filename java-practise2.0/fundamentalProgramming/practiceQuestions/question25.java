package practiceQuestions;

import java.util.Arrays;

public class question25 {
    public static void main(String[] args) {
        //int[] arr = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4};
        int[] arr = {0, 0, 0, 0};
        //int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
        //removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n];

        if (arr[0] == arr[n - 1]) {
            arr1[0] = arr[0];
            int[] subArray = Arrays.copyOfRange(arr1, 0, 1);
            String arrayString = Arrays.toString(subArray);
            System.out.println(arrayString);
            return 1;
        } else {
            int temp = arr[0];
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (temp != arr[i]) {
                    arr1[count] = temp;
                    temp = arr[i];
                    count++;
                }
            }
            arr1[count] = arr[n - 1];
            int[] subArray = Arrays.copyOfRange(arr1, 0, count + 1);
            String arrayString = Arrays.toString(subArray);
            System.out.println(arrayString);
            return count;
        }
    }
//    private static void removeDuplicates(int[] arr) {
//        int n = arr.length;
//        int[] arr1 = new int[n];
//
//        if (arr[0] == arr[n - 1]) {
//            arr1[0] = arr[0];
//            System.out.println(Arrays.toString(arr1));
//        } else {
//            int temp = arr[0];
//            int count = 0;
//            for (int i = 0; i < n; i++) {
//                if (temp != arr[i]) {
//                    arr1[count] = temp;
//                    temp = arr[i];
//                    count++;
//                }
//            }
//            arr1[count] = arr[n - 1];
//            System.out.println(Arrays.toString(arr1));
//        }
//    }


//    public static void removeDuplicates(int[] arr) {
//        int n = arr.length;
//        if (arr[0] == arr[n - 1]) {
//            System.out.println(arr[0]);
//        } else {
//            int temp = arr[0];
//            for (int i = 0; i < n; i++) {
//                if (temp != arr[i]) {
//                    System.out.println(temp);
//                    temp = arr[i];
//                }
//            }
//            System.out.println(arr[n - 1]);
//        }
//
//    }
}
