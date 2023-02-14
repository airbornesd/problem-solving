package lecture15;

public class question2 {
    public static void main(String[] args) {

        Integer a = 89;
        int a1 = 89;

        // auto-boxing
        // primitive to non-primitive
        a = a1;

        // un-boxing
        // non-primitive to primitive
        int b = a;

        // wrapper class twist
        // cache range -128 to 127
        Integer a2 = 45;
        Integer a3 = 45;
        Integer a4 = 145;
        Integer a5 = 145;

        // to compare value we can use .equals method
        System.out.println(a2 == a3);
        System.out.println(a4 == a5);

    }
}