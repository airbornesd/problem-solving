package practiceQuestions;

// check leap year

import java.sql.SQLOutput;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        leapYear(year);
    }

    public static void leapYear(int n) {

        if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");

        }
    }
}
