/*
Write a Java program to print all even numbers between 1 to 100. - using while loop
 */

public class Question19 {
    public static void main(String[] args) {
        int i = 1;
        int n = 100;

        while (n >= 2 * i) {
            System.out.println(2 * i);
            i++;
        }

    }
}
