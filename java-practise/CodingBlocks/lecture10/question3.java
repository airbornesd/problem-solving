package lecture10;

// insertion sort

public class question3 {
    public static void main(String[] args) {
        int[] arr = {10, 7, 9, 3, 8, 2};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            j++;
            arr[j] = temp;

        }

    }

}

// not understood