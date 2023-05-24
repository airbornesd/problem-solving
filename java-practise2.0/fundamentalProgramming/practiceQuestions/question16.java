package practiceQuestions;
import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextLong();
        }
        productArray(arr);
    }

    private static void productArray(long[] arr) {
        //int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            long product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }
            System.out.print(product + " ");
            //arrNew[i] = product;
        }

    }
}
