package practiseQuestions;/*
Factors of a negative numbers
 */

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        for (int i = x; i <= Math.abs(x); i++) {
            // This will skip i == 0 condition
            if (i == 0) {
                continue;
            } else if (x % i == 0) {
                System.out.println(i);
            }
        }
    }
}
