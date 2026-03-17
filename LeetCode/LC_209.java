public class LC_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int min_size = 0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min_size = i;
        }
        int i=0;
        while (i < nums.length) {
            if (sum > target && nums.length - i < min_size) {
                min_size = nums.length - i;
                
            }
            }
            

        
        return 0;
    }

    public static void main(String[] args) {
        LC_209  obj= new LC_209();
        int[] nums = new int[] { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        obj.minSubArrayLen(target, nums);

    }
}