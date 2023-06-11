package lecture46;

public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,8,9,10};
        int amount = 5;
        System.out.println(change(amount, arr));
    }
    public static int change(int amount, int[] coins) {
        int[] combinations = new int[amount + 1];
        combinations[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                combinations[i] += combinations[i - coin];
            }
        }

        return combinations[amount];
    }

}
