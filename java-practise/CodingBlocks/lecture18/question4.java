package lecture18;

import java.util.ArrayList;
import java.util.List;

public class question4 {
    public static void main(String[] args) {
        int n = 3;
        List<String> ll = new ArrayList<>();
        generateParentheses(n, 0, 0, "", ll);
        System.out.println(ll);
    }

    public static void generateParentheses(int n, int open, int close, String ans, List<String> ll) {
        if (open == n && close == n) {
            //System.out.println(ans + " ");
            ll.add(ans);
            return;
        }
        if (open < n) {
            generateParentheses(n, open + 1, close, ans + "(", ll);
        }
        if (close < open) {
            generateParentheses(n, open, close + 1, ans + ")", ll);
        }
    }
}

