public class LC_930 {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
      
        }
         return count;
    }

    public static void main(String[] args) {
        LC_930 obj = new LC_930();
        int[] nums=new int[]{0,0,0,0,0};
        int goal=0;
        System.out.println(obj.numSubarraysWithSum(nums, goal));
    }
}