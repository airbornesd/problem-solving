package lecture20;

public class question3 {
    public static void main(String[] args) {
        int[] coin = {2, 3, 5, 6};
        int amount = 10;
        coinPer(coin, amount, "");
    }

    public static void coinPer(int[] coin, int amount, String ans) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]) {
                coinPer(coin, amount - coin[i], ans + coin[i]);
            }
        }

    }
}
