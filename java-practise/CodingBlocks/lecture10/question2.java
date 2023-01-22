package lecture10;

// selection sort

public class question2 {
    public static void main(String[] args) {
        int[] arr = { 8,2,4,11,9,1 };
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int mini = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[mini]) {
                    mini = i;
                }
            }

            int temp = arr[j];
            arr[j] = arr[mini];
            arr[mini] = temp;

        }

    }

}