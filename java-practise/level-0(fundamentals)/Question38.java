// Create an array of 5 floats and calculate their sum

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextFloat();
        }

        float sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println(sum);

    }
}
