package gettingStarted;

import java.util.Scanner;

public class digitOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;
        int count = 0;
        while (m != 0) {
            m = m / 10;
            count++;
        }

        while (count != 0) {
            int digit = (int) (n / (Math.pow(10, count - 1)));
            digit = digit % 10;
            System.out.println(digit);
            count--;
        }
    }
}
