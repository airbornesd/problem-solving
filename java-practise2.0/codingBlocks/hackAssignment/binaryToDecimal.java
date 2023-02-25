package hackAssignment;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = 2;

        System.out.println(baseToDecimal(num, base));
    }

    public static int baseToDecimal(int num, int base) {
        int count = 0;
        int decimalNum = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;

            decimalNum = (int) (decimalNum + rem * Math.pow(base, count));
            count++;
        }
        return decimalNum;
    }
}
