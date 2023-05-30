package questions;

public class question4 {
    public static void main(String[] args) {
        int n = 0;
        // counting digit;
        int digits = countDigit(n);
        System.out.println("no of digits are: " + digits);
        printDigit(n, digits);
    }

    private static void printDigit(int n, int digits) {

        System.out.print("and the digits are: ");
        if(n == 0) {
            System.out.print(0);
        }
        for (int i = digits; i > 0; i--) {
            int rem = n / (int) (Math.pow(10, i - 1));
            n = n - (int) (rem * Math.pow(10, i - 1));
            System.out.print(rem + " ");
        }
    }

    private static int countDigit(int n) {

        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
