package practiseQuestions;// Write a Java program to reverse an array.

import java.util.Scanner;

public class Question40 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int[] rev = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--){
            rev[j] = arr[i];
            j++;
        }

        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
            System.out.print(" ");
        }


    }
}