package hackAssignment;

import java.util.Scanner;

public class conversionFahToCel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int minVal = scn.nextInt();
        int maxVal = scn.nextInt();
        int step = scn.nextInt();

        converter(minVal, maxVal, step);
    }

    public static void converter(int n, int m, int step) {
        for (int i = n; i <= m; i += step) {
            int c = (i - 32) * 5 / 9;
            System.out.println(i + " " + c);
        }

    }
}
