package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        int difference = 0;

        int count = 0;
        while (n2 != 0 || n1 != 0) {
            int carry = 0;

            int num2 = n2 % 10;
            int num1 = n1 % 10;

            if (num2 < num1) {
                num2 = num2 + b;
                carry = -1;
            } else if (num1 < b && num2 >= b) {
                num2 = num2 - 2;
            }

            n2 = (n2 / 10) + carry;
            n1 = n1 / 10;

            int lastDigitDifference = num2 - num1;
            difference = (int) (lastDigitDifference * Math.pow(10, count)) + difference;

            count++;
        }

        return difference;

    }
}
