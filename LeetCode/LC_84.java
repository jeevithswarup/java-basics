
import java.util.Stack;

public class LC_84 {

    public int largestRectangleArea(int[] heights) {
        int[] pse = new int[heights.length];
        int[] nse = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        int area = 0;
        int max_area = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!st.empty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nse[i] = heights.length;
            } else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();

        for (int i = 0; i < heights.length; i++) {
            area = heights[i] * (nse[i] - pse[i] - 1);
            max_area = Math.max(max_area, area);
        }
        return max_area;
    }
    public static void main(String[] args) {
        LC_84 obj = new LC_84();
        int[] heights = new int[] { 2, 1, 5, 6, 2, 3 };
        System.out.println(obj.largestRectangleArea(heights));
    }

}
