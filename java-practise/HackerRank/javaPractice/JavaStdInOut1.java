package javaPractice;

import java.util.Scanner;

public class JavaStdInOut1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        System.out.print(x + "\n" + y + "\n" + z);

    }

}
