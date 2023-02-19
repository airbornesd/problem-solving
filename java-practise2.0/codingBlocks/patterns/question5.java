package patterns;

public class question5 {
    public static void main(String[] args) {
        int n = 5;
        int m = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("\t");
            }
            for (int k = m; k >= 1; k--) {
                System.out.print("*\t");
            }
            System.out.println();
            m--;
        }
    }
}