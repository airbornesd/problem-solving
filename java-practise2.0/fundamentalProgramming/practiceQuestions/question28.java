package practiceQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the input values
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        // Step 2: Calculate the values of f(i)
        int[] fValues = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            fValues[i] = array1[i + 1] ^ array1[i];
        }

        // Step 3: Sort the indices based on f(i) values in descending order
        Integer[] sortedIndices = new Integer[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sortedIndices[i] = i;
        }
        Arrays.sort(sortedIndices, Comparator.comparingInt(i -> fValues[(int) i]).reversed());

        // Step 4: Reorder array1 based on the sorted indices
        int[] orderedArray1 = new int[n];
        for (int i = 0; i < n - 1; i++) {
            orderedArray1[i] = array1[sortedIndices[i]];
        }
        orderedArray1[n - 1] = array1[n - 1];

        // Step 5: Print the orderedArray1
        for (int i = 0; i < n; i++) {
            System.out.print(orderedArray1[i] + " ");
        }
    }
}