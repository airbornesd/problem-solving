package projectEulerArchives;


public class Problem3 {
    public static void main(String[] args) {
        long n = 600851475143L;

        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.print(i + " ");

            }
        }

        if (n != 1) {
            System.out.println(n);
        }

    }
}

// ans: 6857

