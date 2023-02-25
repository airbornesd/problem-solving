package hackAssignment;

// redo this

import java.util.Scanner;

public class calculateTheSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // number of element of the array
        int n = scn.nextInt();
        int[] arr = new int[n];
        // getting element of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // function for calculating the sum of circular array
        int sum = theSum(arr);

        // q operation
        int x = scn.nextInt();
        // x value for the q operation
        for (int k = 1; k <= x; k++) {
            int wastage = scn.nextInt();
        }

        System.out.println((int) (sum * (Math.pow(2, x))));
    }

    public static int theSum(int[] arr) {

        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }

        return sum;
    }
}
