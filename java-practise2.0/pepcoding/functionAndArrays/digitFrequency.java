package functionAndArrays;

import java.util.Scanner;

public class digitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();

        System.out.println(digitFrequencyFunc(n, target));

    }

    public static int digitFrequencyFunc(int n, int t) {
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit == t) {
                count++;
            }
        }
        return count;
    }
}
