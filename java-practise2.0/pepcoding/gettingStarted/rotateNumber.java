package gettingStarted;

import java.util.Scanner;

public class rotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int num = n;

        // no of digit
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        // for rotation greater than number of digit
        k = k % count;

        // for -ve rotation value
        if(k <= 0) {
            k = count + k;
        }

        // calculation
        int num1 = (int) (num % Math.pow(10, k));
        int num2 = (int) (num / Math.pow(10, k));
        num = (int) (num1 * Math.pow(10, count - k)) + num2;

        System.out.println(num);


    }
}
