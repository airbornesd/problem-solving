package lecture15;

// string palindrome
// using two-pointer approach
// using while loop due to complexity facing in for loop; for loop can also be used

public class question1 {
    public static void main(String[] args) {
        String str = "nlitiln";
        System.out.println(isPalindrome(str));
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

