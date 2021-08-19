// frequency in array
// incomplete : not able to remove repeated element in the output

package practiseQuestions;

import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            int temp = arr[j];
            int count = 0;
            System.out.print("arr[" + j + "] : " + arr[j]);
            for (int i = 0; i < arr.length; i++) {
                if (temp == arr[i]) {
                    count++;
                }
            }

            System.out.print(" -- frequency : " + count);
            System.out.println();

        }


    }
}
