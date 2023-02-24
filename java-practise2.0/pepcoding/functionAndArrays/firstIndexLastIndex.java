package functionAndArrays;

import java.util.Scanner;

public class firstIndexLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        indexes(a, d);
    }

    public static void indexes(int[] arr, int d) {
        int i = 0;
        int j = arr.length - 1;
        int first = 0;
        int last = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] < d) {
                i = mid + 1;
            } else if (arr[mid] > d) {
                j = mid - 1;
            } else {
                first = mid;
                j = mid - 1;
            }
        }
        System.out.println(first);


        i = 0;
        j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] < d) {
                i = mid + 1;
            } else if (arr[mid] > d) {
                j = mid - 1;
            } else {
                last = mid;
                i = mid + 1;
            }

        }
        System.out.println(last);
    }
}
