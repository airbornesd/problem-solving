package functionAndArrays;

import java.util.Scanner;

public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        int targetBase = scn.nextInt();

        int anyBaseNum = baseToDecimal(num, base, 10);
        System.out.println(baseToDecimal(anyBaseNum, 10, targetBase));

    }

    public static int baseToDecimal(int num, int base, int targetBase) {
        int count = 0;
        int decimalNum = 0;
        while (num != 0) {
            int rem = num % targetBase;
            num = num / targetBase;

            decimalNum = (int) (decimalNum + rem * Math.pow(base, count));
            count++;
        }
        return decimalNum;
    }
}
