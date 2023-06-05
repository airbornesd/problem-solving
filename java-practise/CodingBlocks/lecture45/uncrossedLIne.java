package lecture45;

public class uncrossedLIne {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 2, 5};
        int[] arr2 = {10, 5, 2, 1, 5, 2};
        maxUncrossedLine(arr1, arr2);
    }

    private static void maxUncrossedLine(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++) {
            int jCount = 0;
            for (int j = jCount; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    j = jCount;
                    System.out.println(arr1[i] + "" + arr2[j]);
                    jCount++;
                    break;
                }
                jCount++;
            }
        }
    }
}
