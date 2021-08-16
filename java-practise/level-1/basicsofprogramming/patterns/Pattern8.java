package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = n;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= (n - i) + 1; j++) {
                if (j == count) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            count--;
        }
    }
}
