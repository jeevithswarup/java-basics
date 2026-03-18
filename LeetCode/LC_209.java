public class LC_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int min_len = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                min_len = Math.min(min_len, right - left + 1);
                sum -= nums[left];
                left++;
            }
            

        }
     return (min_len == Integer.MAX_VALUE) ? 0 : min_len;
    }

    public static void main(String[] args) {
        LC_209  obj= new LC_209();
        int[] nums = new int[] { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        obj.minSubArrayLen(target, nums);

    }
}