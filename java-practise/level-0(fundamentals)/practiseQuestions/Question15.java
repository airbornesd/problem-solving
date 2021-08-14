package practiseQuestions;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char enteredCharacter = scn.next().charAt(0);

        // Logic:
        if (enteredCharacter >= 'A' && enteredCharacter <= 'Z') {
            System.out.println("Uppercase");
        } else if (enteredCharacter >= 'a' && enteredCharacter <= 'z') {
            System.out.println("Lowercase");
        } else if (enteredCharacter >= 0 && enteredCharacter <= '9') {
            System.out.println("A digit");
        } else {
            System.out.println("Special Character");
        }


    }
}
