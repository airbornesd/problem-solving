package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class PrimeFactorisationOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.print(i + " ");

            }
        }

        if (n != 1) {
            System.out.println(n);
        }

    }
}
// why: i * i <= n; because prime factor of a prime number must be number itself
// why: n != 0; because it could not be greater than it's root n value, therefore n must it's factor
