public class LC_724 {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int leftsum = 0;
            
        for (int j = 0; j < nums.length; j++) {   
            sum -= nums[j];

            if (leftsum == sum) {
                return j;
            }

            leftsum += nums[j];
          
        }

        return -1;
    }

    public static void main(String[] args) {
        LC_724 obj = new LC_724();
        int[] nums = new int[] {2,1,-1};
       System.out.println(obj.pivotIndex(nums));
    }
}

