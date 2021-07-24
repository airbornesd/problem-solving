/*
Factors of a given number:
 */


import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        for (int y = x; y >= 1; y--) {
            for (int b = 1; b <= y; b++) {
                if (b * y == x) {
                    System.out.println(b + " * " + y + " = " + x );
                }
            }
        }

    }
}
// not so good approach but it will work for positive integers (brute force)