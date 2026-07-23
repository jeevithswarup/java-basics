
import java.util.Stack;

public class LC_2104 {
    
   
    public long SumArrayRanges(int[] arr) {
        int n=arr.length;
        Stack <Integer> st= new Stack<>();
        int[] nextgtr = new int[n];
        int[] prevgtr = new int[n];
        int[] prev = new int[arr.length];
        int[] next = new int[arr.length];
      
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            nextgtr[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st.clear();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            prevgtr[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        
      
         st.clear();
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
       
        long smallest = 0;
        long largest = 0;

        for (int i = 0; i < arr.length; i++) {

            long left = i - prev[i];
            long right = next[i] - i;

            smallest = smallest + (1L * arr[i] * left * right);

            long maxleft = i - prevgtr[i];
            long maxright = nextgtr[i] - i;

            largest = largest + (1L * arr[i] * maxleft * maxright);
        }

        return largest-smallest;
    }
    
}
