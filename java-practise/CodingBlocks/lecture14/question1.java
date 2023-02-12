package lecture14;

public class question1 {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = new String("hello");

        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str3 == str2); // we are checking address not the value
        System.out.println(str1 == str); // we are checking the value

        if(str1 == str2 ){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
