/*
Write a Java program to check whether a number is Prime and Armstrong using functions.
 */

import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = checkPrimeNum(n);
        int b = checkArmstrongNum(n);

        if ( a == 0 && b == 0){
            System.out.println("Number is Prime and Armstrong");
        } else if ( a == 1 && b == 0) {
            System.out.println("Number is not Prime but Armstrong");
        } else if ( a == 0 && b == 1){
            System.out.println("Number is Prime but not Armstrong");
        } else {
            System.out.println("Number is not Prime and not Armstrong");
        }

    }

    public static int checkPrimeNum(int x) {

        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return 1;
            }
        }
        return 0;
    }

    public static int checkArmstrongNum(int x) {
        int z = x;
        int armstrongCheck = x;

        int armsNum = 0;

        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }

        for (int i = 0; i < count; i++) {
            int lastDigit = z % 10;
            z = z / 10;
            lastDigit = (int) Math.pow(lastDigit, count);
            armsNum = lastDigit + armsNum;
        }

        if (armsNum == armstrongCheck) {
            return 0;
        }
        return 1;
    }
}
