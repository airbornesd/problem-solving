package practiseQuestions;/*
Write a Java program to find cube of any number using function.
 */

import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();

        a = cubeRoot(a, n);
        System.out.println(a);
    }

    public static int cubeRoot(int x, int y) {
        x = (int) Math.pow(x, y);
        return x;
    }
}
