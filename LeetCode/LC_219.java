

public class LC_219 {
    public int containsNearbyDuplicate(int[] nums, int k) {
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
         int max_sum = sum;
        for (int i = 0; i < nums.length-k; i++) {
            int j = k + i;
            sum= sum-nums[i]+nums[j];
            if (sum > max_sum) {
                max_sum = sum;
            }
        }
          
        return sum;
    }
    public static void main(String[] args) {
        LC_219 obj = new LC_219();
        int[] nums = new int[] {1,2,3,9};
        int k = 3;
     System.out.println(obj.containsNearbyDuplicate(nums, k));
     }
}
