package practiceQuestions;

public class question22 {
    public static void main(String[] args) {
        int[] arr = {2, -18, 45, 30};
        sortArr(arr, arr.length);
    }

    private static void sortArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        display(arr, n);
    }

    private static void display(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }

}
