package practiseQuestions;/*
Write a Java program to swap first and last digits of a number.
 */

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int numberChanged = n;
        int p = n;
        int l = n;

        int countNotSo = 0;
        while (n >= 10) {
            n = n / 10;
            countNotSo++;
        }

        int count = countNotSo + 1;
        n = (int) (n * Math.pow(10, (count - 1)));
        p = p % 10;
        n = n + p;
        l = l - n;
        numberChanged = (int) ((numberChanged % 10) * Math.pow(10, (count - 1))) + (int) (numberChanged / Math.pow(10, (count - 1)));
        numberChanged = numberChanged + l;

        System.out.println(numberChanged);
    }
}
// Eliminate variable like countNotSo and p or l. And change numberChanged to swap
