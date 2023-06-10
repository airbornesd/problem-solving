package questions;

public class question012 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3, 1, 2, 7, 5};
        int maxVal = max(arr, n);

        // display
        for (int i = maxVal; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if(arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
                //System.out.print(arr[j] + "," + i + "\t");
            }
            System.out.println();
        }
    }

    private static int max(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
