// store array to new array

package practiseQuestions;

import java.util.Scanner;

public class Question45 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("[ ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print( arr2[i] );
            if (i < arr2.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }
}
