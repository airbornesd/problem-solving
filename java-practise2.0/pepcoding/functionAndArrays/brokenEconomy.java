package functionAndArrays;

import java.util.Scanner;

public class brokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        //System.out.println("hello");
        ceilFloor(arr, target);

    }

    public static void ceilFloor(int[] arr, int d) {
        int low = 0;
        int high = arr.length - 1;
        int floor = 0;
        int ceil = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (d < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            } else if (d > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else {
                high = mid;
                low = mid;
                break;
            }
        }
        System.out.println(ceil + " " + floor);
    }
}
/*
 10
 1 5 10 15 22 33 40 42 55 66
 34
 */