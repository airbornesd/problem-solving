package lecture28;

import java.util.Stack;

public class question1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st); // print full stack st
        System.out.println(st.peek()); // print last element of the stack
        System.out.println(st.pop()); // remove last element of the stack
        System.out.println(st); // print full stack st
        System.out.println(st.peek()); // print last element of the stack
        System.out.println(st.size()); // no of element present in stack st
        System.out.println(st.isEmpty()); // is stack empty?

    }
}
