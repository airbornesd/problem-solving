package hackAssignment;

import java.util.*;

public class chewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        chewbacca(n);
    }

    public static void chewbacca(long n) {

        long m = n;
        long count = 0;
        long chewNum = 0;
        int counter = 0;

        while (m != 0) {
            m = m / 10;
            counter++;
        }

        while (n != 0) {
            long digit = n % 10;
            n = n / 10;
            long minNum = 9 - digit;

            if (counter == count + 1 && minNum == 0) {
                minNum = 9;
            }
            if (minNum < digit) {
                chewNum = (long) (chewNum + (minNum * Math.pow(10, count)));
            } else {
                chewNum = (long) (chewNum + (digit * Math.pow(10, count)));
            }
            count++;
        }

        System.out.println(chewNum);

    }
}