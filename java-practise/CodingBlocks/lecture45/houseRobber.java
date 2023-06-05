package lecture45;

public class houseRobber {
    public static void main(String[] args) {
        int[] arr = {5, 21, 7};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int maxAmount = 0;

        for (int i = 0; i < n; i++) {
            int amount = 0;
            int prevMax = 0;

            for (int j = i; j < n; j++) {
                int temp = amount;
                amount = Math.max(prevMax + nums[j], amount);
                prevMax = temp;
            }

            maxAmount = Math.max(maxAmount, amount);
        }

        return maxAmount;
    }

}
