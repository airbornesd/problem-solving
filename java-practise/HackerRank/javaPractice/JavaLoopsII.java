package javaPractice;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int q = scn.nextInt();
        for (int z = 0; z < q; z++) {

            int a = scn.nextInt();
            int b = scn.nextInt();
            int n = scn.nextInt();
            int s = 0;

            for (int i = 0; i < n; i++) {

                s = s + (int) (Math.pow(2, i) * b);
                int sNew = a + s;
                System.out.print(sNew + " ");

            }
            System.out.println( );
        }
    }
}
