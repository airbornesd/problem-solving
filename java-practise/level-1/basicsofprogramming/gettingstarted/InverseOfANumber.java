package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;
        int sum = 0;

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        int indexValue = 0;
        for (int i = 0; i < count; i++) {
            int p = (int) (m / Math.pow(10, i)) % 10;
            indexValue++;

            int l = (int) (indexValue * Math.pow(10, (p - 1)));
            sum = sum + l;

        }
        System.out.println(sum);

    }
}
