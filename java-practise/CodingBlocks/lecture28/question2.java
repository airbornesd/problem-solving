package lecture28;

import java.util.Stack;

public class question2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        insertDown(st, -0);
        System.out.println(st);
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
