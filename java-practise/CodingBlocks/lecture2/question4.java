package lecture2;

// pattern 3
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 1;
        while (i <= n) {
            int j = n;
            while (j >= i) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }

    }
}
