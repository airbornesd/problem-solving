package practiceQuestions;

public class question24 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        lenOfLongSubarr(arr, n, k);
    }

    private static void lenOfLongSubarr(int[] arr, int n, int k) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (int l = i; l <= j; l++) {
                    sum = sum + arr[l];
                    count++;

                }
                if (sum == k && count > counter) {
                    counter = count;
                }
            }
        }
        System.out.println(counter);
    }
}
