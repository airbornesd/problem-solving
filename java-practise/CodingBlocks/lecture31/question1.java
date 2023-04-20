package lecture31;

public class question1 {
    public static void main(String[] args) {
        String str = "IIIDIDDD";
        System.out.println(numberFromDI(str));
    }

    public static String numberFromDI(String str) {

        int count = 1;
        int[] ans = new int[str.length() + 1];
        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == 'I') {
                ans[i] = count;
                count++;
                for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
                    ans[j] = count;
                    count++;

                }
            }

        }
        String s = "";
        for (int i = 0; i < ans.length; i++) {

        }
        return s;
    }

}

// incomplete
// convert ans to string
// submit to leetcode