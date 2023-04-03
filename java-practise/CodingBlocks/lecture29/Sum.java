package lecture29;

public class Sum {
    public static void main(String[] args) {
        System.out.println(add(2, 4));
        System.out.println(add(2, 4, 8));
        System.out.println(add(2, 4, 8.5F));
        System.out.println(add(2, 4, 5, 6, 7, 8, 9, 0, 1, 2, 6, 6));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, float c) {
        return (int) (a + b + c);
    }

    public static int add(int x, int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
