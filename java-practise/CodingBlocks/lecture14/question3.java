package lecture14;

public class question3 {
    public static void main(String[] args){
        String str = "hellobye";
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = new String("bye");
        System.out.println(str.charAt(1));
        String s = "hello"; // different location
        String s1 = "bye";
        str2 = str2 + str3;
        s = s + s1;  // new location allocated after concatenation
        String s2 = "hello" + "bye";
        String s3 = "hello" + "bye";

        System.out.println(str2 == s);
        System.out.println(str == s2);
        System.out.println(str == s);
    }
}
