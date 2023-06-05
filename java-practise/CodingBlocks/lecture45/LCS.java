package lecture45;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String text1 = "abc";
        String text2 = "abc";
        //System.out.println(lcs(text1, text2, 0, 0));
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(lcsDP(text1, text2, 0, 0, dp));
    }
    // using recursion
    // giving tle
    public static int lcs(String s1, String s2, int i, int j) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = 1 + lcs(s1, s2, i + 1, j + 1);
        } else {
            int f = lcs(s1, s2, i + 1, j);
            int s = lcs(s1, s2, i, j + 1);
            ans = Math.max(f, s);
        }
        return ans;
    }

    // using dp
    public static int lcsDP(String s1, String s2, int i, int j, int[][] dp) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = 1 + lcsDP(s1, s2, i + 1, j + 1, dp);
        } else {
            int f = lcsDP(s1, s2, i + 1, j, dp);
            int s = lcsDP(s1, s2, i, j + 1, dp);
            ans = Math.max(f, s);
        }
        return dp[i][j] = ans;

    }
}
