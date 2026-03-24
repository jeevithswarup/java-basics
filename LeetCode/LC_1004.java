public class LC_1004 {

    public int longestOnes(int nums[], int k) {
        int zero_count = 0;
        int left = 0;
        int long_one = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zero_count++;
            }
            while (zero_count > k) {
                if (nums[left] == 0) {
                    zero_count--;
                }
                left++;
            }
            int count = right - left + 1;
            long_one = Math.max(long_one, count);
            
        }
        return long_one;
    }
    public static void main(String[] args) {
        LC_1004 obj = new LC_1004();
        int[] nums = new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(obj.longestOnes(nums, k));
    }
    
}
