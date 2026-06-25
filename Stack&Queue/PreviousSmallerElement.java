import java.util.ArrayList;
import java.util.Stack;

public class PreviousSmallerElement {
    
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int x : arr) {

            while (!st.isEmpty() && st.peek() >= x) {
                st.pop();
            }

            if (st.isEmpty()) {
                res.add(-1);
            } else {
                res.add(st.peek());
            }
            st.push(x);
        }

        return res;
    }
    public static void main(String[] args) {
        PreviousSmallerElement obj = new PreviousSmallerElement();
        int[] arr = new int[]{ 4, 5, 2, 10, 8 };
        System.out.println(obj.prevSmaller(arr));

    }
}

