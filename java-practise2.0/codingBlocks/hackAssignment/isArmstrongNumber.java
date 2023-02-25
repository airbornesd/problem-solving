package hackAssignment;

import java.util.Scanner;

public class isArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (checkArmstrong(n) == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

    public static int checkArmstrong(int n) {
        int m = n;
        int numCheck = n;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        int armstrong = 0;
        while (m != 0) {
            armstrong = (int) Math.pow(m % 10, count) + armstrong;
            m = m / 10;

        }
        if (armstrong == numCheck) return 1;
        return 0;
    }
}
