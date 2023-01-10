package lecture1;

// eligible to vote or not

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        if( age >= 18 ) {
            System.out.println("Vote");
        } else {
            System.out.println("No Vote");
        }
    }
}
