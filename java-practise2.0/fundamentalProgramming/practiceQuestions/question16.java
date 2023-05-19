package practiceQuestions;
import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        productArray(arr);
    }

    private static void productArray(int[] arr) {
        //int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
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
