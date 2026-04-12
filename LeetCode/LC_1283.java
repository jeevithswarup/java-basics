public class LC_1283 {
    int total_sum = 0;
    int low = 0;
    int high = 0;

    public int smallestDivisor(int[] nums, int threshold) {
        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]);
        }
        while (low <= high) {
            int mid = (low + high) / 2;

            if (divisorValue(nums, threshold, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    

    public int divisorValue(int[] nums, int threshold,int mid) {
       
        
        for (int x : nums) {
            total_sum += (int)Math.ceil((double)x / mid);
         }
        return total_sum;
    }
    
    public static void main(String[] args) {
        LC_1283 obj = new LC_1283();
        int[] nums = new int[] {1,2,5,9};
        int threshold = 6;
        System.out.println(obj.smallestDivisor(nums, threshold));
        System.out.println(obj.divisorValue(nums, threshold));
    }
}
