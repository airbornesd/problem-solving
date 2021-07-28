package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    // Any Base To Decimal
    public static int getValueIndecimal(int n, int b) {
        int decimalValue = 0;
        int count = 0;
        while (n != 0) {
            int div = n % 10;

            count++;
            decimalValue = (int) (div * Math.pow(b, count - 1)) + decimalValue;

            n = n / 10;

        }
        return decimalValue;

    }
}
