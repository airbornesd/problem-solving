package lecture19;

// tower of hanoi

public class question3 {
    public static void main(String[] args) {
        int n = 3;
        toh(n, "A", "C", "B");
    }

    public static void toh(int n, String src, String des, String help) {
        if (n == 0) {
            return;
        }

        toh(n - 1, src, help, des);
        System.out.println("MOVE " + n + " DISK FROM " + src + " TO " + help);
        toh(n - 1, help, des, src);
    }
}
