// nagarro // inversion count // level: easy
// input: 5
// { 41, 18467, 6334, 26500, 19169 }
// output: 2
// from left to right // as no number less than 41 therefore 0;
// 18467 - 1 // 6334 - 0 // 26500 - 1 // so total = 2

package practiseQuestions;

import java.util.Scanner;

public class Question52 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(inversion(arr));

    }

    public static int inversion(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    counter++;
                }
            }
        }
        return (counter);
    }
}
