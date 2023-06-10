package questions;

public class question001 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(isPrime(n));
        // 1 - prime
        // 0 - not a prime
    }

    private static int isPrime(int n) {
        for (int i = 2; i * i <= n; i ++ ){
            if(n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}
