package lecture13;

// 2-d array declaration

public class question1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr);
        System.out.println(arr[0]);
        int row = arr.length;
        int col = arr[0].length;
        arr[1][2] = -9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
