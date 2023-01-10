package lecture2;

// pattern4
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 1;
        while (i <= n) {
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

