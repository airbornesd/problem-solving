// broken economy question via functionAndArray
// done by linear search method
// binary search should be use

package practiseQuestions;

import java.util.Scanner;

public class Question48 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of element in the array
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int count = a.length;
        int temp = 0;
        for (int i = a.length - 1; i >= 0; i--) {

            if (a[i] < d) {
                temp = a[i];
                break;
            }
            count--;
        }
        if (a[count] == d) {
            System.out.println(a[count]);
        } else {
            System.out.println(a[count]);
            System.out.println(temp);
        }
    }
}
