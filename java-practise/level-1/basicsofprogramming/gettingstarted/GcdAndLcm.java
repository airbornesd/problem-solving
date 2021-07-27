package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int numHelp = 0;

        if (num1 < num2) {
            numHelp = num2;
            num2 = num1;
            num1 = numHelp;
        }

        int num1temp = num1;
        int num2temp = num2;

        while (num1 % num2 != 0) {
            // using: https://www.math-only-math.com/examples-to-find-highest-common-factor-of-two-numbers-by-using-division-method.html
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (num1temp * num2temp) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }
}
