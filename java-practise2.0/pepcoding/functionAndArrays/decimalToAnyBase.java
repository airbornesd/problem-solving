package functionAndArrays;

import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();

        System.out.println(decimalToBase(num, base));
    }

    public static int decimalToBase(int num, int base) {
        int count = 0;
        int baseNum = 0;
        while (num != 0) {
            int rem = num % base;
            num = num / base;

            baseNum = (int) (baseNum + rem * Math.pow(10, count));
            count++;
        }
        return baseNum;
    }
}
