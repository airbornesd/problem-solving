package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // number n of base b1
        int b1 = scn.nextInt();
        int b2= scn.nextInt(); // n of base b1 to be converted to base b2

        int m = anyBaseToDecimal(n, b1);
        int ans = decimalToAnyBase(m, b2);

        // Answer:
        System.out.println(ans);

    }

    // Any base to decimal base
    public static int anyBaseToDecimal(int n, int b1) {
        int decimalValue = 0;
        int count = 0;
        while (n != 0) {
            int div = n % 10;
            count++;
            decimalValue = (int) (div * Math.pow(b1, count - 1)) + decimalValue;
            n = n / 10;
        }
        return decimalValue;
    }

    // Decimal to any base
    public static int decimalToAnyBase(int n, int b2) {
        int remTemp = 0;
        int count = 0;
        while (n != 0) {
            int rem = n % b2;
            n = n / b2;
            count++;
            remTemp = (int) (rem * Math.pow(10, count - 1)) + remTemp;
        }
        return remTemp;
    }


}

