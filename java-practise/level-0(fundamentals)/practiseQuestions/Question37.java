package practiseQuestions;// arrays declaration
import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // declaring an array 'arr' with size of 'n'
        int[] arr = new int[n];

        // initializing the "arr" till size "n"
        for (int i= 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        // printing the array's elements
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
