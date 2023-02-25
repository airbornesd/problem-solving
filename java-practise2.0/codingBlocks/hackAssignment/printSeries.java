package hackAssignment;

import java.util.Scanner;

public class printSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        printSeriesFunc(n1, n2);

    }

    public static void printSeriesFunc(int n1, int n2) {
        int count = 0;
        int counter = 0;
        for (int i = 1; i <= n1; i++) {
            n1 = n1 + count;
            int series = (3 * i) + 2;
            if (series % n2 == 0) {
                count++;
            } else {
                System.out.println(series);
                counter++;
            }
            if (counter == 10) break;
        }


    }
}
