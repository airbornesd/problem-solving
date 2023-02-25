package hackAssignment;

// redo

import java.util.Scanner;

public class inverseOfNumber {
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
