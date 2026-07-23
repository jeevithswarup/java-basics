
import java.util.Stack;



public class LC_735 {
    

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
         
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(asteroids[i])) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
            }
        }
          int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;

    }
    

    public static void main(String[] args) {
        LC_735 obj = new LC_735();
         int[] asteroids=new int[]{3,5,-6,2,-1,4};
         obj.asteroidCollision(asteroids);
        
    }
}
