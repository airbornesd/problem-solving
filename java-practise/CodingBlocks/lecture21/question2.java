package lecture21;

import java.util.ArrayList;
import java.util.List;

public class question2 {
    public static void main(String[] args) {
        String ques = "nitin";
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partitioning(ques, list, ans);
        System.out.println(ans);
    }

    public static void partitioning(String ques, List<String> list, List<List<String>> ans) {
        if (ques.length() == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindrome(s)) {
                list.add(s);
                partitioning(ques.substring(i), list, ans);
                // backtracking
                list.remove(list.size() - 1);
            }
        }

    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
