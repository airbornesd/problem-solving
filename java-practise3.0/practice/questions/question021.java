package questions;

public class question021 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        findMaxConsecutiveOnes(arr);

    }
    public static void findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            if(count > countMax) {
                countMax = count;
            }
        }

        System.out.println(countMax);

    }
}
