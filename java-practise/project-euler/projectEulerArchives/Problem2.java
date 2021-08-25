package projectEulerArchives;

public class Problem2 {
    public static void main(String[] args) {
        int i = 2, x = 1, y = 0, sum = 0;

        while (i > 0) {
            int fibTemp = x + y;
            y = x;
            x = fibTemp;
            if (fibTemp % 2 == 0 && sum < 4000000) {
                sum = sum + fibTemp;

            }
            i++;
        }
        System.out.println(sum);
    }
}

// ans: 4613732