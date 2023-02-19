package patterns;

public class question6 {
    public static void main(String[] args) {
        int n = 5;
        int jTempUse = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < jTempUse; j++) {
                System.out.print("\t");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("*\t");
            }
            System.out.println();
            jTempUse += 2;

        }
    }
}
