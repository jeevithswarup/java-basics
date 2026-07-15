import java.util.Arrays;
import java.util.Stack;
public class LC_901 {
    
    public int[] StockSpanner(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = i+1;
            } else {
                res[i] = i-st.peek();
            }
            st.push(i);
        }
        return res;

     }
     public static void main(String[] args) {
         LC_901 obj = new LC_901();
         int[] arr = new int[] { 100, 80, 60, 70, 60, 75, 85 };
         System.out.println(Arrays.toString(obj.StockSpanner(arr)));
     }
}