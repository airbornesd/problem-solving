package gettingStarted;

import java.util.Scanner;

public class inverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 1;
        int inverse = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            digit = (int) (count * Math.pow(10, digit - 1));
            inverse = inverse + digit;
            count++;
        }
        System.out.println(inverse);

    }
}

/*
    inverse of a number is only true when no digit is missing or repeating from example
    1 to 5 : 23415 || inverse : 13452
    1 to 8 : 28346751 || inverse : 73425681
    explanation:
    face value | index value | what we will do?
    2 - 8 * 10 pow 1
    8 - 7 * 10 pow 7      now what we have to do is replace index value with face value
    3 - 6 * 10 pow 2      for that we do is change the iv to fc by multi it by fc value's 10 pow (fc - 1)
    4 - 5 * 10 pow 3
    6 - 4 * 10 pow 5
    7 - 3 * 10 pow 6
    5 - 2 * 10 pow 4
    1 - 1 * 10 pow 0
 */
