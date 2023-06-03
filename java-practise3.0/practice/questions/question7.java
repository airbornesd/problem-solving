package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class question7 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(Arrays.toString(primeFactor(n)));

    }

    private static int[] primeFactor(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i * i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n = n / i;
                if (count < 1) {
                    primeFactors.add(i);
                }
                count++;
            }
        }
        if (n != 1) {
            primeFactors.add(n);
        }

        int[] primeFactorsArray = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            primeFactorsArray[i] = primeFactors.get(i);
        }

        return primeFactorsArray;
    }
}


















