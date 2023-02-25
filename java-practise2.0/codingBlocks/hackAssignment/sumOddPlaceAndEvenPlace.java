package hackAssignment;

import java.util.Scanner;

public class sumOddPlaceAndEvenPlace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        sumOddEven(n);
    }

    public static void sumOddEven(int n) {

        int counter = 1, sumOfEven = 0, sumOfOdd = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            if (counter % 2 == 0) {
                sumOfEven = sumOfEven + digit;
            } else {
                sumOfOdd = sumOfOdd + digit;
            }
            counter++;
        }
        System.out.println(sumOfOdd + "\n" + sumOfEven);
    }
}
