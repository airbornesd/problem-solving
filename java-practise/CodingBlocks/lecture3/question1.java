package lecture3;

import java.util.Scanner;

// pattern13
// wrong approach, done on coding blocks ide
public class question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // upper part
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }


        // lower part
        int k = 1;
        while (k <= n) {
            int j = n - 1;
            while (j >= k) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            k++;
        }
    }

}
