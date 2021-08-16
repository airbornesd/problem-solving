package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = (n / 2) + 1;
        int spaces = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            System.out.println();


            if (i <= n / 2) {
                star--;
                spaces = spaces + 2;
            } else {
                star++;
                spaces = spaces - 2;
            }
        }

    }

}
