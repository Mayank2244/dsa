package Stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
        Stack<String>st=new Stack<>();
        st.push("RAM");
        st.push("LAKSHMAN");
        st.push("BHARAT");
        st.push("SHATRUGAN");
        st.push("4BHAI");
        System.out.println(st);
        System.out.println(st.size());
        st.pop();
        System.out.println(st);
        st.peek();
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}
