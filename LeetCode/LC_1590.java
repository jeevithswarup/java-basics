
import java.util.HashMap;

public class LC_1590 {
    
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
            int target = sum % p;
            if (target == 0) {
                return 0;
        }
        sum = 0;
        int count = 0;
        int min_len = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - target)) {
                int length = i - (map.get(sum - target));
                min_len = Math.min(min_len, length);
            } else {
                map.put(sum, i);
            }
        }
        if (min_len > 0) {
            return min_len;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        LC_1590 obj = new LC_1590();
        int[] nums = new int[] {6,3,5,2};
        int p = 9;
        System.out.println(obj.minSubarray(nums, p));
    }

}