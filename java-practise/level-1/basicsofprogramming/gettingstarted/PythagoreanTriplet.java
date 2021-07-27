package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int numHelp = 0;

        if (c < b) {
            numHelp = b;
            b = c;
            c = numHelp;
        }

        int x = (int) Math.sqrt((a * a + b * b));

        if (x == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
