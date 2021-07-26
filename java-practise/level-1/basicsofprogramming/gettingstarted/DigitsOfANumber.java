package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        for (int i = (count - 1); i >= 0; i--) {
            int d = (int) (m / Math.pow(10, i)) % 10;
            System.out.println(d);
        }

    }
}
