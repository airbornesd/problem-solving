// Patter-5

package practiseQuestions;

import java.util.Scanner;

public class Question43 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = (m / 2) + 1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*\t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*\t");
            }
            for (int j = n - 1; j > i; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
