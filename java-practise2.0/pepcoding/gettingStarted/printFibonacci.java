package gettingStarted;

import java.util.Scanner;

public class printFibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //        int fib = 0;
//        int fib1 = 1;
//        System.out.println(fib);
//        System.out.println(fib1);
//
//        for (int i = 0; i < n - 2; i++) {
//            int fib2 = fib1 + fib;
//            fib = fib1;
//            fib1 = fib2;
//            System.out.println(fib2);
//        }

        // mine is also correct but no problem

        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        /*
        explanation:
         0 1 1 2 3 5 8 13 21 34
         so what's going here is we are adding two preceding/ previous number
         ie: 0, 1, 0 + 1- 1, 1 + 1- 2, 1 + 2- 3, 2 + 3-5
         so a = 0; b = 1;
            c = a + b;
            a = b;
            b = c;
         */

    }
}

