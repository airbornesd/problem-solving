package lecture1;

import java.util.Scanner;

// marks given; give grades
public class question7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n < 35) {
            System.out.println("F");
        } else if (n < 45) {
            System.out.println("D");
        } else if (n < 55) {
            System.out.println("C");
        } else if (n < 65) {
            System.out.println("B");
        } else if (n < 81) {
            System.out.println("A");
        } else {
            System.out.println("A+");
        }
    }
}
