package hackAssignment;

import java.util.Scanner;

public class pairOfRoses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int m = scn.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scn.nextInt();
            }
            int target = scn.nextInt();

            priceRoses(arr, target);
        }

    }

    public static void priceRoses(int[] arr, int d) {
        sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int rose1 = 0;
        int rose2 = 0;
        while (i < j) {
            if (arr[i] + arr[j] == d) {
                rose1 = arr[i];
                rose2 = arr[j];
                i++;
                j--;
            } else if (arr[i] + arr[j] > d) {
                j--;
            } else if (arr[i] + arr[j] < d) {
                i++;
            }
        }

        System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
    }

    // tle: due to using two loops
    // public static void priceRoses(int[] arr, int d) {
    //     sort(arr);

    //     int rose1 = 0;
    //     int rose2 = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             if (arr[i] + arr[j] == d) {
    //                 rose1 = arr[i];
    //                 rose2 = arr[j];
    //             }
    //         }
    //     }
    //     System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + " .");
    // }


    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
