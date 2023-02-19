package lecture16;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(powFunc(a, b));
    }

    public static int powFunc(int a, int b) {

        if (b == 0) return 1;

        int pow = powFunc(a, b - 1);
        return pow * a;

    }
}
