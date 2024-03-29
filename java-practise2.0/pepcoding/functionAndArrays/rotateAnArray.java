package functionAndArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rotateAnArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k) {
        // write your code here
        k = k % a.length;
        if(k < 0 ) {
            k = k + a.length;
        }
        int n = a.length;
        reverse(a, 0, n - 1 - k); // 1st half of array
        reverse(a, n - k, n - 1); // 2nd remaining array
        reverse(a, 0, n - 1); // new reversed array, all through

    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}
