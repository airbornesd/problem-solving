package lecture9;

// rotate the array to the right by k
// not optimised

public class question4 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 17, 5, 8};
        int k = 3;
        reverse(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void reverse(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        while (k > 0) {
            int temp = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
            k--;
        }
    }

}
