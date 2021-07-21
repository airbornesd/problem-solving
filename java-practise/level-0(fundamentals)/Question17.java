import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 1;
        int n = scn.nextInt();

        while (n >= i) {
            System.out.println(n);
            n--;
        }

    }
}
