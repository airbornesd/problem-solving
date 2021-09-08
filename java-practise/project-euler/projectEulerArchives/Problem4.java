package projectEulerArchives;

public class Problem4 {
    public static void main(String[] args) {
        int maxNumber = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int k = i * j;
                if (palindrome(k) && k > maxNumber) {
                    maxNumber = k;
                }
            }
        }
        System.out.println(maxNumber);
    }

    public static boolean palindrome(int num) {
        int reversedNum = 0, remainder;

        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
