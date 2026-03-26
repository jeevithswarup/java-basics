import java.util.HashMap;

public class LC_974 {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        LC_974 obj = new LC_974();
        int[] nums = new int[] { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        System.out.println(obj.subarraysDivByK(nums, k));
    }
}
