package functionAndArrays;

import java.util.Scanner;

public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        if (n2 > n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        //getSum(b, n1, n2);
        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int sumTotal = 0;
        int count = 0;
        while (n1 != 0) {
            int temp1 = n1 % 10;
            n1 = n1 / 10;
            int temp2 = n2 % 10;
            n2 = n2 / 10;
            int sum = temp1 + temp2;
            if (sum >= b) {
                sumTotal = (int) (sumTotal + (sum % b) * Math.pow(10, count));
                n1 = n1 + (sum / b);
            } else {
                sumTotal = (int) (sumTotal + sum * Math.pow(10, count));
            }
            //    System.out.println(sumTotal);
            count++;
        }
        return sumTotal;
    }
}
