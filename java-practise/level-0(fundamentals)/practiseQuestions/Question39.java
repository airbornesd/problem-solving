package practiseQuestions;// Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int checkNumber = scn.nextInt();
        boolean foundNumber = false;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == checkNumber) {
                foundNumber = true;
                break;
            }
        }

        if (foundNumber) {
            System.out.println("Num Found");
        } else {
            System.out.println("Num not Found");
        }

    }
}
