package lecture9;

// reversing the array by taking input for pointers

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};

        reverse(arr, a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


    }
}

