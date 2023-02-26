package lecture18;

// subsequence

public class question1 {
    public static void main(String[] args) {
        subSequence("abc", "");
        //System.out.println(count);
    }

    public static void subSequence(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        char ch = ques.charAt(0);
        subSequence(ques.substring(1), ans);
        subSequence(ques.substring(1), ans + ch);

    }
}
