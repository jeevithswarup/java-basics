import java.util.Arrays;
import java.util.Stack;
public class NextSmallerIndex {
    
    public int [] Nse(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            
            
            while (!st.isEmpty() && arr[i] >= arr[st.peek()-1]) {
                st.pop();
                
            }

            if (st.isEmpty()) {
                res[i] = arr.length;
            } else {
                res[i] =i;
            }

            st.push(i);
        }
            

        
        return res;
    }
    public static void main(String[] args) {
        NextSmallerIndex obj = new NextSmallerIndex();
        int[] arr = new int[] { 3, 1, 2, 4 };
        System.out.println(Arrays.toString(obj.Nse(arr)));
    }
}
