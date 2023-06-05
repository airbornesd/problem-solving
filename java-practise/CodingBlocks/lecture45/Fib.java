package lecture45;

public class Fib {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fib(n - 1);
        int f2 = fib(n - 1);
        return f1 + f2;
    }

    public static int fibDP(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int f1 = fibDP(n - 1, dp);
        int f2 = fibDP(n - 1, dp);
        return dp[n] = f1 + f2;
    }
}
