package lecture45;

public class houseRobberr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Robber(arr, arr.length - 1));
    }

    private static int Robber(int[] arr, int i) {
        if (i < 0) {
            return 0;
        }
        int rob = arr[i] + Robber(arr, i - 2);
        int dontRob = Robber(arr, i - 1);
        return Math.max(rob, dontRob);
    }

}
