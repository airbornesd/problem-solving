package hackAssignment;

import java.util.Scanner;

public class arrayLinearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int d) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                return i;
            }
        }
        return -1;
    }
}
