package questions;

import java.util.Arrays;

public class question3 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Arrays.toString(printFib(n)));
    }
    public static long[] printFib(int n)
    {
        long[] arr = new long[n];
        // although fibonacci series start from 0 1 1 2 3 5 8
        long a = 0;
        long b = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = a;
            long c = a + b;
            a = b;
            b = c;
        }

        return arr;
    }
}
