package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Size of Array[n]
        int n = scn.nextInt();
        int[] arr = new int[n];

        // Initialization of Array: arr
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Getting max for maximum no of star pattern to be printed
        int max = arr[0];
        int j = 1;
        while (j < arr.length) {
            if (max < arr[j]) {
                max = arr[j];
            }
            j++;
        }

        // l the maximum number of star length to be printed
        // or number of floors in a building
        for (int l = max; l >= 1; l--) {

            // k will be number of building to be printed
            for (int k = 0; k < arr.length; k++) {

                if (arr[k] >= l) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();

        }

    }
}
