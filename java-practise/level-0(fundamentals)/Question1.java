// Introduction to Scanner Class

// Importing java.util.Scanner package before we can use Scanner class

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Create a tool(k/a-object) for reading user input and name it scn.
        Scanner scn = new Scanner(System.in);

        // Ask user to "Write a message:"
        System.out.print("Write a message: ");

        // Now here we will assign a data type-String were the input message will be stored
        String writeMessage = scn.nextLine();

        // Print the written message by the user
        System.out.println(writeMessage);

    }
}