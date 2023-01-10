package lecture1;

// divisible by 6

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if ( n % 6 == 0) {
            System.out.println("Divisible by 6");
        } else {
            System.out.println("Not Divisible");
        }
    }
}
