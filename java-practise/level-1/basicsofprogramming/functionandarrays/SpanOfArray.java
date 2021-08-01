package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        int j = 1;
        while (j < arr.length ){
            if ( max < arr[j] ){
                max = arr[j];
            }
            j++;
        }

        int k = 1;
        while (k < arr.length ){
            if ( min > arr[k] ){
                min = arr[k];
            }
            k++;
        }

        int span = max - min;
        System.out.println(span);

    }
}
