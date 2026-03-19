

public class LC_713 {

    public int numSubarrayProductLessThanK(int [] nums,int k){
        int product = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product > k) {
                product = product / nums[left];
                left++;

                
            }
        }
        return 0;
    }
  public static void main(String[] args) {
      LC_713 obj = new LC_713();
      int[] nums = new int[] { 10, 5, 2, 6 };
      int k = 100;
      obj.numSubarrayProductLessThanK(nums,k);
  }
    
}