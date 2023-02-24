package functionAndArrays;

import java.util.Scanner;

public class anyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        //getProduct(b, n1, n2);
        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
        int counter2 = 0;
        int temp2 = n2;
        while (temp2 != 0) {
            temp2 = temp2 / 10;
            counter2++;
        }

        int newTemp = 0;
        int sumGetterTemp = 0;
        for (int i = 0; i < counter2; i++) {
            int counter = 0;
            while (n2 != 0) {
                int count = 0;

                int digitX = n2 % 10;
                n2 = n2 / 10;

                int tempN1 = (int) (n1 * Math.pow(10, counter));
                int carry = 0;
                int digitXYZ = 0;
                while (tempN1 != 0 || carry != 0) {
                    int digitY = tempN1 % 10;
                    tempN1 = tempN1 / 10;

                    int digitXY = (digitX * digitY) + carry;
                    int reminder = digitXY % b;

                    digitXYZ = (int) (digitXYZ + reminder * Math.pow(10, count));
                    carry = digitXY / b;

                    count++;
                }
                //System.out.println(digitXYZ);
                if (digitXYZ != 0) {
                    sumGetterTemp = (getSum(b, digitXYZ, newTemp));
                    newTemp = sumGetterTemp;
                    //System.out.println(newTemp);
                    //System.out.println(sumGetterTemp);
                }

                counter++;
            }
        }
        return sumGetterTemp;

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