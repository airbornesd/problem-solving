package practiceQuestions;

// copy content from one array to another in reverse order

import java.util.Scanner;

public class question7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[arr.length - i - 1];
        }

        for (int val : arr2) {
            System.out.println(val);
        }
    }
}
