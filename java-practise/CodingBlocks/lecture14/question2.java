package lecture14;

// to check content of two strings are same or not
// if address are same then content will be same 100%
// if address are not same we will then compare length
// in non-primitive cases "==" is used for checking address
// backend code for equals() method

public class question2 {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hello";
        System.out.println(str.length());
        System.out.println(equals(str, str1));

    }

    public static boolean equals(String s1, String s2) {
        // checking address
        if (s1 == s2) {
            return true;
        }
        // comparing length
        if (s1.length() != s2.length()) {
            return false;
        }

        // checking each value
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
