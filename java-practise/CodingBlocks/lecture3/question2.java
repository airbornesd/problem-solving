package lecture3;

import java.util.Scanner;

//patter14
// incomplete
public class question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 1;
        while (i <= 2 * n - 1) {

            int j = n - 1;
            while (j >= i) {
                System.out.print("  ");
                j--;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
            i++;
        }

    }
}
