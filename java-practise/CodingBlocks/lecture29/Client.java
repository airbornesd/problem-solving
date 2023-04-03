package lecture29;

public class Client {
    public static void main(String[] args) {
        // case1
//        P obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

        // case2
//        P anyThing = new C();
//        System.out.println(anyThing.d);
//        System.out.println(anyThing.d1);
//        System.out.println(((C) anyThing).d2);
//        System.out.println(((C) anyThing).d);
//        anyThing.fun();
//        anyThing.fun1();
//        ((C) anyThing).fun2();

        // case3 (always error)
//        C obj = new P();

        // case4
        C obj = new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(obj.d2);
        System.out.println(((P) obj).d);
        obj.fun();
        obj.fun1();
        obj.fun2();

    }
}
