public class LC_930 {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int sum = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > goal) {
                sum = sum - nums[left];
                left++;
            }
            if (sum == goal) {
                count++;
            }

        }
        if (sum == goal) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        LC_930 obj = new LC_930();
        int[] nums=new int[]{1,0,1,0,1};
        int goal=2;
        System.out.println(obj.numSubarraysWithSum(nums, goal));
    }
}