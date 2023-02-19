package patterns;

public class question27 {
    public static void main(String[] args) {
        int n = 5;
        int m = n;
        int starK = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = m - 1; j >= 1; j--) {
                System.out.print("   \t");
            }

            int k2 = 1;
            int temp = 0;
            for (int k = 1; k <= starK; k++) {
                temp++;
                System.out.print(k2 + " \t");
                if (temp > (starK / 2)) {
                    k2--;
                } else {
                    k2++;
                }
            }
            m--;
            starK += 2;

            System.out.println();
        }
    }
}