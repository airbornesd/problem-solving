package lecture30;

import java.util.Stack;

public class question3 {
    public static void main(String[] args) {
        //int[] arr = {2, 3, 5, 4, 6, 1, 7}; // 12
        int[] arr = {2, 3, 5, 4, 6, 1, 7, 8}; // 14

        System.out.println(area(arr));
    }

    public static int area(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int r = i;
                int h = arr[st.pop()];
                if (st.isEmpty()) {
                    int area = h * r;
                    ans = Math.max(ans, area);
                } else {
                    int l = st.peek();
                    int area = h * (r - l - 1);
                    ans = Math.max(ans, area);
                }
            }
            st.push(i);
        }

        int r = arr.length;
        while (!st.isEmpty()) {
            int h = arr[st.pop()];
            if (st.isEmpty()) {
                int area = h * r;
                ans = Math.max(ans, area);
            } else {
                int l = st.peek();
                int area = h * (r - l - 1);
                ans = Math.max(ans, area);
            }
        }

        return ans;

    }
}
