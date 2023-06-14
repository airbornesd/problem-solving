package questions;

public class question017 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        subarray(arr, n);
    }

    private static void subarray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
