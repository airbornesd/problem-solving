package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of element in the array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int ceil = -1;
        int floor = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == data) {
                ceil = data;
                floor = data;
            } else if (arr[mid] > data) {
                ceil = arr[mid];
                right = mid - 1;
            } else {
                floor = arr[mid];
                left = mid + 1;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}
// to be completed