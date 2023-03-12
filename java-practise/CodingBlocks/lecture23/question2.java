package lecture23;

public class question2 {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        sudokuSolver(arr, 0, 0);

    }

    public static void sudokuSolver(int[][] arr, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            display(arr);
            return;
        }
        if (arr[row][col] != 0) {
            sudokuSolver(arr, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isSafe(arr, row, col, val) == true) {
                    arr[row][col] = val;
                    sudokuSolver(arr, row, col + 1);
                    arr[row][col] = 0;
                }

            }
        }
    }

    public static boolean isSafe(int[][] arr, int row, int col, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] == val) {
                return false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[row][i] == val) {
                return false;
            }
        }
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (arr[i][j] == val) {
                    return false;
                }
            }

        }
        return true;

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
