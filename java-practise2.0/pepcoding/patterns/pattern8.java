package patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


        // from this solution we are getting tle
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("\t");
//            }
//            System.out.print("*\t");
//            for (int j = 1; j < i; j++) {
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
    }
}
