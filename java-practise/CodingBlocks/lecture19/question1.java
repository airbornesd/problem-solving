package lecture19;

// lexicology

public class question1 {
    public static void main(String[] args) {
        int n = 1000;
        counting(0, n);
    }

    public static void counting(int curr, int end) {
        if (curr > end) {
            return;
        }
        System.out.println(curr);

        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            counting(curr * 10 + i, end);
        }

    }
}
