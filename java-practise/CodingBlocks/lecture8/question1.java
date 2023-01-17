package lecture8;

import java.util.Scanner;

// basic of arrays
public class question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        display(arr);

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }
}

// hw - complete all questions from pattern, functions, array basics
// total - approx 40 questions
// next class - string, stringBuilder, arrayList