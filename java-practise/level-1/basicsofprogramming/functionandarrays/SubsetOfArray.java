package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of element in the array
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int numOfSub = (int) Math.pow(2, a.length);


        for (int i = 0; i < numOfSub; i++) {
            int bn = getValueInBase(i, 2);
            int div = (int) Math.pow(10, a.length - 1);
            for (int j = 0; j < a.length; j++) {
                int q = bn / div;
                int r = bn % 10;
                if (q == 1) {
                    System.out.print(a[j] + "\t");
                } else {
                    System.out.print("-\t");
                }
                bn = r;
                div /= 10;
            }
            System.out.println();
        }

    }

    public static int getValueInBase(int n, int b) {

        int remTemp = 0, count = 0;
        while (n != 0) {
            int rem = n % b;
            n = n / b;

            count++;
            remTemp = (int) (rem * Math.pow(10, count - 1)) + remTemp;
        }
        return remTemp;

    }
}

// wrong output
// not completed
