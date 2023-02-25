package hackAssignment;

import java.util.Scanner;

public class revisingQuadraticEquations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int d = rootNature(a, b, c);

        if (d > 0) {
            int root1 = (int) ((-b + Math.sqrt(d)) / 2 * a);
            int root2 = (int) ((-b - Math.sqrt(d)) / 2 * a);
            System.out.println("Real and Distinct");
            System.out.println(root2 + " " + root1);
        } else if (d == 0) {
            int root1 = (int) ((-b + Math.sqrt(d)) / 2 * a);
            System.out.println("Real and Equal");
            System.out.println(root1 + " " + root1);
        } else {
            System.out.println("Imaginary");
        }
    }

    public static int rootNature(int a, int b, int c) {
        int d = (b * b) - 4 * (a * c);
        return d;

    }
}
