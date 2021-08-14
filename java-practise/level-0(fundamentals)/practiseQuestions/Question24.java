package practiseQuestions;/*
 Write a C program to count number of digits in a number.
 */

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }
}
/*
          https://www.programiz.com/c-programming/examples/digits-count
n = 3452
The integer entered by the user is stored in variable n.
Then the while loop is iterated until the test expression n! = 0 is evaluated to 0 (false).
After the first iteration, the value of n will be 345 and the count is incremented to 1.
After the second iteration, the value of n will be 34 and the count is incremented to 2.
After the third iteration, the value of n will be 3 and the count is incremented to 3.
After the fourth iteration, the value of n will be 0 and the count is incremented to 4.
Then the test expression of the loop is evaluated to false and the loop terminates.
 */