package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        for (int i = 0; i < count; i++) {
            int p = (int) (m / Math.pow(10, i)) % 10;
            System.out.println(p);
        }

    }
}
