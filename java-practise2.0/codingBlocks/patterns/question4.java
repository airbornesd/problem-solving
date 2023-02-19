package patterns;

public class question4 {
    public static void main(String[] args) {
        int n = 5;
        int m = n;

        for (int i = 1; i <= n; i++) {
            for (int j = m - 1; j > 0; j--) {
                System.out.print(" \t");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*\t");
            }
            System.out.println();
            m--;
        }
    }
}
