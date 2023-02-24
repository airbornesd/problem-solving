package practiceQuestions;

// copy content from one array to another

import java.util.Scanner;

public class question8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int value : arr2) {
            System.out.println(value);
        }
    }
}
