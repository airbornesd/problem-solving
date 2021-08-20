package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int m = getMultiplication(b, n1, n2);
        System.out.println(m);

    }

    public static int getMultiplication(int b, int n1, int n2) {
        int ans = 0;
        int powerX = 1;
        while (n2 != 0) {
            int temp = n2 % 10;
            n2 = n2 / 10;

            int singleDigitProduct = getProductSingleDigit(b, n1, temp);
            ans = getSum(b, ans, singleDigitProduct * powerX);
            powerX = powerX * 10; // in first power- 1 ; then * 10; then * 10; till n2 != 0
        }

        return ans;
    }

    public static int getProductSingleDigit(int b, int n1, int temp) {
        int ans = 0;
        int quotient = 0; // carry
        int p = 1;
        while (n1 != 0 || quotient > 0) {

            int temp2 = n1 % 10;
            n1 = n1 / 10;

            //temp2 = temp2 * temp + quotient;
            int temp3 = temp2 * temp + quotient;
            quotient = temp3 / b;
            temp3 = temp3 % b;

            ans = ans + temp3 * p;
            p = p * 10;

        }
        return ans;
    }
    // getting wrong output due to getSum
    // recheck
    public static int getSum(int base, int n1, int n2) {
        int remainderSum = 0;

        int count = 0;
        while (n1 != 0) {
            int quotient = 0; // this would be used as carry
            int remainder = 0; // this would be used as sum

            int num1 = n1 % 10;
            int num2 = n2 % 10;

            int lastDigitSum = num1 + num2;

            if (lastDigitSum >= base) {
                quotient = lastDigitSum / base;
                remainder = lastDigitSum % base;
            } else {
                // quotient = 0;
                remainder = lastDigitSum;
            }

            n1 = (n1 / 10) + quotient;
            n2 = n2 / 10;

            count++;
            remainderSum = (int) (remainder * (Math.pow(10, count - 1))) + remainderSum;

        }
        return remainderSum;
    }


}

