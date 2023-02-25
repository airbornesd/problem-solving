package hackAssignment;

import java.util.Scanner;

public class replaceThemAll {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        if(n == 0) {
            System.out.println("5");
        } else {
            replaceFunc(n);
        }
    }

    public static void replaceFunc(long n) {

        long numNew = 0;
        long count = 1;
        while (n != 0) {

            long m = n % 10;
            n = n / 10;

            if (m == 0) {
                n = n * 10 + 5;
            } else {
                numNew = numNew + (long) (m * Math.pow(10, count - 1));
                count++;
            }
        }

        System.out.println(numNew);

    }
}