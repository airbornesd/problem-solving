package practiceQuestions;

public class question20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        runningSum(arr);
    }

    private static void runningSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.print(sum + " ");
        }
    }
}
