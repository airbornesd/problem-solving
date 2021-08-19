package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // number n given
        int d = scn.nextInt(); // frequency of digit d
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int digitCount = 0;
        while (n != 0) {
            int div = n % 10;

            int count = 0;
            if (div == d) {
                count++;

            }
            digitCount = count + digitCount;
            n = n / 10;

        }
        return digitCount;
    }


}
