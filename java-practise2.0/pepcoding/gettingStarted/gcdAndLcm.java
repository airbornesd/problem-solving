package gettingStarted;

import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int gcd = 0;

        // gcd brute force
        // although there is another way also to solve this
        for (int i = num1; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }

        // lcm using formula
        int lcm = (num1 * num2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }
}
