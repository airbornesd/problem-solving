package hackAssignment;

import java.util.Scanner;

public class lowerArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char c = scn.next().charAt(0);
        int ascii = (int) c;
        if(97 <= ascii || ascii >= 122 ) {
            System.out.println("lowercase");
        } else if (65 <= ascii || ascii >= 90 ) {
            System.out.println("UPPERCASE");
        } else {
            System.out.println("Invalid");
        }

    }
}