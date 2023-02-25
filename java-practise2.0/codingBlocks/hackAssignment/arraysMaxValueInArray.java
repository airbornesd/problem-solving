package hackAssignment;

import java.util.Scanner;

public class arraysMaxValueInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(maxValue(arr));
        //maxValue(arr);
    }

    //using linear search
    public static int maxValue(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }


//    public static int maxValue(int[] arr) {
//
//        int i = 0;
//        int j = arr.length - 1;
//        int maxI = arr[i];
//        int maxJ = arr[j];
//        while (i <= j) {
//            if (arr[i] > maxI) {
//                maxI = arr[i];
//            }
//            if (arr[j] > maxJ) {
//                maxJ = arr[j];
//            }
//
//            i++;
//            j--;
//        }
//        return Math.max(maxJ, maxI);
//    }


}