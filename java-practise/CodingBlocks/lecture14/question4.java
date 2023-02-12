package lecture14;

// lexicalCheck
// Dictionary logic

public class question4 {
    public static void main(String[] args) {
        String str = "ankita";
        String str1 = "ankit";

        if (lexicalCheck(str, str1) > 0) {
            System.out.println(str);
        } else {
            System.out.println(str1);
        }

//        System.out.println(str.compareTo(str1));
    }

    public static int lexicalCheck(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }
}
