package lecture9;

// reverse the array
// 2 pointer algorithm

public class question2 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 17, 5, 8};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


    }
}
