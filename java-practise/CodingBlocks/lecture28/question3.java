package lecture28;

import java.util.Stack;

public class question3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reversal(st);
        System.out.println(st);
    }

    public static void reversal(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int val = st.pop();
        reversal(st);
        insertDown(st, val);
    }


    public static void insertDown(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
            return;
        }

        int val = st.pop();
        insertDown(st, item);
        st.push(val);
    }
}

