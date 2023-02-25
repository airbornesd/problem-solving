package hackAssignment;

import java.util.Scanner;

public class oddAndEvenBackDelhi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for (int i = 0; i < num; i++) {
            int vehicleNum = scn.nextInt();

            if (vehicleNum % 2 == 0) {
                sumOfNumber(vehicleNum, 4);
            } else {
                sumOfNumber(vehicleNum, 3);
            }
        }
    }

    public static void sumOfNumber(int vehicleNum, int condition) {
        int sum = 0;
        while (vehicleNum != 0) {
            int digit = vehicleNum % 10;
            vehicleNum = vehicleNum / 10;
            sum = sum + digit;
        }
        if (sum == 0) {
            System.out.println("Yes");
        } else if (sum % condition == 0 || sum % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
