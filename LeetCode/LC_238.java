
import java.util.Arrays;

public class LC_238 {
    public int[] ProductExceptItSelf(int[] nums) {
    
        int n = nums.length;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[n- 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;

    }
    public static void main(String[] args) {
        LC_238 obj = new LC_238();
        int[] nums = new int[] {1, 2, 3, 4};
       System.out.println(Arrays.toString(obj.ProductExceptItSelf(nums)));
    }
}
