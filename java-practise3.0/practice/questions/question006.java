package questions;

public class question006 {
    public static void main(String[] args) {
        int n = 15;
        int m = 20;
        int l = 100;

        int x = gcd(n, m);
        int x1 = lcm(n, m, x);
        int y = gcd(n, l);
        int y1 = lcm(n, l, y);
        System.out.println(gcd(x1, y1));

    }

    private static int gcd(int n, int m) {
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        int gcdVal = 0;
        for (int i = n; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                gcdVal = i;
                break;
            }
        }
        return gcdVal;
    }

    private static int lcm(int n, int m, int gcdVal) {
        return n * m / gcdVal;
    }

}

//Input: x = 15, y = 20, z = 100
//        Output: 60
//        Explanation: GCD(LCM(15,20), LCM(15,100))
//        =GCD(60,300)=60.