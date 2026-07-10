package Stack;

import java.util.Stack;

public class nse {
    public int[] nextsmaller(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }
        st.push(arr[n - 1]);
        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.size() > 0) {
                ans[i] = st.peek();
            }
            st.push(arr[i]);

        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        nse nextsm = new nse();
        int[] ans = nextsm.nextsmaller(arr);
        System.out.println("enter the value");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
