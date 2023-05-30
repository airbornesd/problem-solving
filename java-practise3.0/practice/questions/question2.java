package questions;

import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) {
        int m  = 1;
        int n = 10;
        System.out.println(primeRange(m, n));
    }

    private static ArrayList<Integer> primeRange(int m, int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = m; i <= n; i++) {
            if(isPrime(i)) {
                numbers.add(i);
            }
        }

        return numbers;
    }

    private static boolean isPrime(int n) {
        if(n == 1) return false;
        for (int i = 2; i * i <= n; i ++ ){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
