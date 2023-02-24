package practiceQuestions;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        int x = factorial(n - 1);
        int y = x * n;
        return y;
    }

}