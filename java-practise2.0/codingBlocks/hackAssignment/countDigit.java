package hackAssignment;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit = scn.nextInt();

        int count = 0;
        while (n != 0) {
            int counter = n % 10;
            n = n / 10;
            if (counter == digit) {
                count++;
            }
        }
        System.out.println(count);


    }
}
