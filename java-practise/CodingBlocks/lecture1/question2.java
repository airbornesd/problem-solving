package lecture1;

import java.util.Scanner;

// simple interest question

public class question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int r = scn.nextInt();
        int t = scn.nextInt();

        int si = (p * r * t) / 100;

        System.out.println(si);

    }
}
