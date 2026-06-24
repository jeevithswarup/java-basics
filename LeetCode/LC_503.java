
import java.util.Arrays;
import java.util.Stack;

public class LC_503 {
    
    public int[] nextElementll(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
          int[] res = new int[n];
          for (int i = 2 * n - 1; i >= 0; i--) {
              int idx = i % n;

            while (!st.isEmpty() && st.peek()<=arr[idx]) {
                st.pop();
            }

            if (i < n) {
                res[idx] = st.isEmpty() ?-1:st.peek();
            }
            st.push(arr[idx]);
            

        }




        return res;
   }

    public static void main(String[] args) {
        LC_503 obj = new LC_503();
        int[] arr = new int[] { 1, 10, 12, 2, 11 };
        int n = arr.length;
        System.out.println(Arrays.toString(obj.nextElementll(arr,n)));
    }
}
