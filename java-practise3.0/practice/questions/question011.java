package questions;

public class question011 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {-2, 1, -4, 5, 3};
        System.out.println(finSum(arr, n));
    }

    private static int finSum(int[] arr, int n) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max + min;
    }
}
