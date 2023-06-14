package questions;

public class question019 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int target = 7;
        System.out.println(searchInSorted(arr, n, target));
    }

    public static int searchInSorted(int[] arr, int N, int K) {

        // Your code here
        for (int i = 0; i < N; i++) {
            if (arr[i] == K) return 1;
        }
        return -1;

    }
}
