/*
Write a Java program to print all odd number between 1 to 100.
 */

public class Question20 {
    public static void main(String[] args) {

        int n = 100;
        for (int i = 0; i < (n / 2); i++) {
            System.out.println(2 * i + 1);
        }
    }
}
// although it can also be done by using if statement, that would be more acceptable
