package lecture2.assignment;

import java.util.Scanner;

// pattern21
// redo
public class question6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int space = 2 * n - 3;
        int row = 1;
        while (row <= n) {

            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            // space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            // star
            int k = 1;
            if (row == n) {
                k = 2;
            }
            while (k <= star) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
            row++;
            space -= 2;
            star++;
        }


    }
}
