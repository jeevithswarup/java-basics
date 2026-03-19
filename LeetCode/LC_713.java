

public class LC_713 {

    public int numSubarrayProductLessThanK(int [] nums,int k){
        int product = 1;
        int left = 0;
        int count = 0;
        if (k <= 1) {
            return 0;
            
        }
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
        
            while (product >=k) {
                product = product / nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
  public static void main(String[] args) {
      LC_713 obj = new LC_713();
      int[] nums = new int[] { 10, 5, 2, 6 };
      int k = 1;
      System.out.println(obj.numSubarrayProductLessThanK(nums,k));
  }
    
}