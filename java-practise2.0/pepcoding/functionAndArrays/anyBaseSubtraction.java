package functionAndArrays;

import java.util.Scanner;

public class anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        // write your code here
        int sumTotal = 0;

        int count = 0;
        while (n2 != 0) {
            int temp2 = n2 % 10;
            n2 = n2 / 10;
            int temp1 = n1 % 10;
            n1 = n1 / 10;
            if (temp2 < temp1) {
                temp2 = temp2 + b;
                int difTotal = temp2 - temp1;
                sumTotal = (int) (sumTotal + difTotal * Math.pow(10, count)); // correct
                n2 = n2 - 1;
                if (n2 % 10 > b) {
                    int newTemp2 = n2 % b; // b - 1
                    int newTemp3 = n2 % 10; //w
                    n2 = (n2 - newTemp3) + (b - newTemp2);
                }
            } else {
                int difTotal = temp2 - temp1;
                sumTotal = (int) (sumTotal + difTotal * Math.pow(10, count));
            }


            //    System.out.println(sumTotal);
            count++;
        }
        return sumTotal;
    }

}