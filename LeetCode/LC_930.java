public class LC_930 {

    public int numSubarraysWithSum(int[] nums, int goal) {
      
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
              int sum=0;
            for (int j = i; j < nums.length; j++) {
                   sum+=nums[j];
                if ( sum== goal) {
                 
                    count++;
                }
            }
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