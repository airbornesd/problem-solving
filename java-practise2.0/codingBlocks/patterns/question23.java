package patterns;

public class question23 {
    public static void main(String[] args) {
        int n = 5;
        int m = n;
        int starK = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = m - 1; j >= 1; j--) {
                System.out.print("\t");
            }
            for (int k = 1; k <= starK; k++) {
                System.out.print("1\t");
            }
            m--;
            starK += 2;

            System.out.println();
        }
    }
}
