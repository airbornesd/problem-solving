package lecture14;

// print all substring of abcd
// a ab abc abcd b bc bcd c cd d

public class question5 {
    public static void main(String[] args) {
        String str = "abcd";
        subString(str);
    }

    public static void subString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

}
