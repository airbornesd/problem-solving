package lecture11;

// LeetCode 53. Maximum Subarray

public class question1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -18, 7, 3};
        System.out.println(MaximumSum(arr));

    }

    public static int MaximumSum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }

//    public static int MaximumSum(int[] arr) {
//        int ans = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                ans = Math.max(ans, sum);
//
//            }
//        }
//        return ans;
//    }
// this is brute force approach

}
