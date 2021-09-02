// THE STATE OF WAKANDA 2D ARRAY
// alternative approach

package practiseQuestions;

import java.util.Scanner;

public class Question50 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        int count = 0;
        while (count < a.length) {
            int j = count;
            for (int i = 0; i < a.length - count; i++) {
                System.out.println(a[i][j]);
                j++;
            }
            count++;
        }

    }
}