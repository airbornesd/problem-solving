package hackAssignment;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(checkingPrime(n));
    }

    public static String checkingPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            return ("Not Prime");
        }
        return ("Prime");
    }
}
