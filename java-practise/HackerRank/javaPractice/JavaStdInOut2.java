package javaPractice;

import java.util.Scanner;

public class JavaStdInOut2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int enteredInteger = scn.nextInt();
        double enteredDouble = scn.nextDouble();
        scn.nextLine(); /* Scanner skipping nextLine() after use of the functions, so
                           to solve this issue we use scn.nextLine(), it reads the next line. */
        String enteredString = scn.nextLine();

        System.out.print("String: " + enteredString + "\nDouble: " + enteredDouble + "\nInt: " + enteredInteger);


    }
}
