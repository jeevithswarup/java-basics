import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
public class LC_496 {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack <Integer> st= new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && nums2[i] >= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }

    


        return nums1;
    }
    



    public static void main(String[] args) {
        LC_496 obj = new LC_496();
        int[] nums1 = new int[] { 4, 1, 2 };
        int[] nums2 = new int[] { 1, 3, 4, 2 };
       System.out.println(Arrays.toString(obj.nextGreaterElement(nums1, nums2)));
        
    }
}
