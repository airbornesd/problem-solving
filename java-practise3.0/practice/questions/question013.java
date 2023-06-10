package questions;

import java.util.Arrays;

public class question013 {
    public static void main(String[] args) {
        int t = 2;
        int[] a = {1};
        int n = a.length;
        int[] b = {9, 9, 9};
        int m = b.length;
        System.out.println(Arrays.toString(findArraySum(a, n, b, m)));
    }

    private static int[] findArraySum(int[] a, int n, int[] b, int m) {
        int[] c = new int[Math.max(n, m)];
        int p = c.length;
        int i = n - 1;
        int j = m - 1;
        int k = p - 1;
        int sum = 0;
        while (i >= 0 || j >= 0) {
            int rem = sum;
            if (i >= 0) {
                rem = rem + a[i];
            }
            if (j >= 0) {
                rem = rem + b[j];
            }

            c[k] = rem % 10;

            if (rem >= 10) {
                sum = 1;
            } else {
                sum = 0;
            }

            i--;
            j--;
            k--;
        }
        if (sum > 0) {
            int[] cNew = new int[p + 1];
            cNew[0] = sum;
            for (int l = 1; l < cNew.length; l++) {
                cNew[l] = c[l - 1];
            }
            return cNew;
        }
        return c;
    }
}
