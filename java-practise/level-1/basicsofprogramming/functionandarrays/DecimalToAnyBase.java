package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    // Decimal to any base
    public static int getValueInBase(int n, int b) {
        int remTemp = 0, count = 0;
        while (n != 0) {
            int rem = n % b;
            n = n / b;

            count++;
            remTemp = (int) (rem * Math.pow(10, count - 1)) + remTemp;
        }
        return remTemp;


    }
}
