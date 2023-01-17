package lecture7;

// intro to functions
public class question1 {
    public static void main(String[] args) {
        System.out.println("Hey");
        add();
        System.out.println("By");
    }

    public static void add(){
        int a = 9;
        int b = 7;
        int c = a + b;
        System.out.println("before sub");
        sub();
        System.out.println(c);
    }

    public static void sub(){
        int a = 9;
        int b = 7;
        int c = a - b;
        System.out.println(c);
        add();
        System.out.println("no in sub");
    }
}
