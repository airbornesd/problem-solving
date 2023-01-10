package lecture1;
// max  of 3 number

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (b > a && b > c) {
            System.out.println(b);
        } else if (a > b && a > c) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }

    }
}
