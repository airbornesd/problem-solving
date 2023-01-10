package lecture2.assignment;


//pattern 6

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j <= 2 * (n - 1)) {
                System.out.print("__");
                j++;
            }
            int k = n;
            while (k >= n) {
                System.out.print("* ");
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
