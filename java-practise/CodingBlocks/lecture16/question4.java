package lecture16;

// find out factorial using tail recursion

import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n, 1));
    }

    public static int fact(int n, int ans) {
        if (n == 0) return ans;

        return fact(n - 1, ans * n);

    }


//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        System.out.println(fact(n));
//    }
//
//    public static int fact(int n) {
//        return factTR(n, 1);
//    }
//
//    public static int factTR(int n, int a) {
//        if (n <= 0) return a;
//        return factTR(n - 1, n * a);
//    }

}
