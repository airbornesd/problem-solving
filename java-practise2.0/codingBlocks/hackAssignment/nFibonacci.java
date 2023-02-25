package hackAssignment;

import java.util.Scanner;

public class nFibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci(int n) {
        int c = 0;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            b = a;
            a = c;
        }
        return c;
    }
}
