package practiseQuestions;/*
Write a Java program to find sum of all natural numbers between 1 to 100.
 */

public class Question21 {
    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i <= 100; i++) {
            n = i + n;
        }
        System.out.println(n);
    }
}
// although it can also be done by using if statement, that would be more acceptable
