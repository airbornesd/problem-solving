package hackAssignment;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        System.out.println(lcmVal(num1, num2));

    }

    public static int lcmVal(int num1, int num2) {

        int gcd = 0;
        for (int i = num1; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }

        return (num1 * num2) / gcd;
    }
}
