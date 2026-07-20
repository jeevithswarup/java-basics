import java.util.Stack;

public class LC_907 {
    
    public int sumSubarraymins(int[] arr) {
        int[] prev = new int[arr.length];
        int[] next = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                next[i] = arr.length;
            } else {
                next[i] = st.peek();
            }
            st.push(i);
        }
        long mod = 1000000007L;
        long ans = 0;

        for (int i = 0; i < arr.length; i++) {

            long left = i - prev[i];
            long right = next[i] - i;

            ans = (ans + (1L * arr[i] * left * right) % mod) % mod;
        }

        return (int) ans;
    }
    public static void main(String[] args) {
        LC_907 obj = new LC_907();
        int[] arr=new int[]{3,1,2,4};
        System.out.println(obj.sumSubarraymins(arr));
    }
}