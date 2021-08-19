package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int temp = 0;

        // Alternative: in while loop just add: while (n1 != 0 || n2 != 0)
        if (n2 > n1) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int d = getSum(base, n1, n2);
        System.out.println(d);

    }

    // Any Base Addition
    public static int getSum(int base, int n1, int n2) {
        int remainderSum = 0;

        int count = 0;
        while (n1 != 0) {
            int quotient = 0; // this would be used as carry
            int remainder = 0; // this would be used as sum

            int num1 = n1 % 10;
            int num2 = n2 % 10;

            int lastDigitSum = num1 + num2;

            if (lastDigitSum >= base) {
                quotient = lastDigitSum / base;
                remainder = lastDigitSum % base;
            } else {
                // quotient = 0;
                remainder = lastDigitSum;
            }

            n1 = (n1 / 10) + quotient;
            n2 = n2 / 10;

            count++;
            remainderSum = (int) (remainder * (Math.pow(10, count - 1))) + remainderSum;

        }
        return remainderSum;
    }
}
