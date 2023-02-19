package lecture16;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PD(n);
    }

    public static void PD(int n) {
        if (n == 0) {
            return;
        }

        PD(n - 1);
        System.out.println(n);
    }
}
