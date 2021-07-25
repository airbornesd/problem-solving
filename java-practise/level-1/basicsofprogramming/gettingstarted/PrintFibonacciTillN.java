package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class PrintFibonacciTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;

        // for n = 0 : 0
        // for n = 1 : 0
        // for n = 2 : 0 1
        // for n = 3 : 0 1 1
        // for n = 4 : 0 1 1 2
        // for n = 5 : 0 1 1 2 3
        // for n = 6 : 0 1 1 2 3 5
        if (n >= 2) {
            System.out.println(firstNumber);
            System.out.println(secondNumber);
        } else if (n == 1) {
            System.out.println(firstNumber);
        }

        for (int i = 2; i < n; i++) {
            int fib = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fib;
            System.out.println(fib);
        }

    }
}
