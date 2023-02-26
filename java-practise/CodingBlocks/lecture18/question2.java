package lecture18;

// count from subsequence

public class question2 {
    public static void main(String[] args) {
        System.out.println(subSequence("abc", " "));
        //System.out.println(count);
    }

    public static int subSequence(String ques, String ans) {
        if (ques.length() == 0) {
            //System.out.println(ans + " ");
            return 1;
        }

        char ch = ques.charAt(0);
        int a = subSequence(ques.substring(1), ans);
        int b = subSequence(ques.substring(1), ans + ch);
        return a + b;

    }
}
