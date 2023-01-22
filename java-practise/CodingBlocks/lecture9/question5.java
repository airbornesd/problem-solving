package lecture9;

// rotate the array to the right by k
// reversal algorithm, optimised
// leetcode: 189

public class question5 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 17, 5, 8};
        int k = 3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

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
}