package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int m = n;

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        // it will reduces the high no of rotation by using module operator
        // a mod b = simple 3 steps at the end.
        k = k % count;
        // for negative rotation
        if (k < 0) {
            k = k + count;
        }

        int n1 = (int) (m / Math.pow(10, k));
        int n2 = (int) (m % Math.pow(10, k));
        int r = (int) (n2 * Math.pow(10, count - k)) + n1;

        System.out.println(r);

    }
}

/*
a mod b:
Step 1. divide a by b;
        a / b
Step 2. subtract remainder by it's integral value
        example: 9 / 7 will be 1.285714286 - 1 = 0.285714286
Step 3. multiple the reminder(or subtracted value) by b
        this will be the a mod b
 */