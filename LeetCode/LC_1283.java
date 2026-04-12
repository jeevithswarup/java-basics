public class LC_1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        if(threshold < nums.length) return -1;
        int low = 1;
        int high = 0;
        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]);
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (divisorValue(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public int divisorValue(int[] nums, int mid) {
    int total_sum = 0;
        for (int x : nums) {
            total_sum +=  (x + mid - 1) / mid; 
         }
        return total_sum;
    }
    public static void main(String[] args) {
        LC_1283 obj = new LC_1283();
        int[] nums = new int[] {1,1,1,1};
        int threshold = 4;
        System.out.println(obj.smallestDivisor(nums, threshold));
        
    }
}
