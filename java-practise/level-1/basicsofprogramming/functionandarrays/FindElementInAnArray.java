package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class FindElementInAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        int indexOfD = -1;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == d) {
                indexOfD = j;
                break;
            }
        }

        System.out.println(indexOfD);

    }
}

// linear search
