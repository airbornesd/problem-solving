package practiseQuestions;/*
Write a Java program to print all alphabets from a to z. - using while loop
 */

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char alphabet = 'a';

        while (alphabet == alphabet) {
            if (alphabet >= 'a' && alphabet <= 'z') {
                System.out.println(alphabet);
                alphabet++;
            }
        }

        //        for (char n = 'a'; n <= 'z'; n++) {
        //            System.out.println(n);
        //        }

    }
}
