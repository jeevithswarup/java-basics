
public class LC_643 {
    
    public double FindMaxAverage(int[] nums, int k) {
        
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max_Avg = sum / k;

        int left = 0;
        int right = k;
        int n = nums.length;
        while (right < n) {
          sum= sum - nums[left] + nums[right];
          double avg = sum / k;
            
          if (avg > max_Avg) {
              max_Avg = avg;
          }
            left++;
            right++;
        }
        return max_Avg;
    }
    public static void main(String[] args) {
        LC_643 obj=new LC_643();
        int[] nums = new int[] { 1, 12, -5, -6, 50, 3 };
        int k = 4;
       System.out.println(obj.FindMaxAverage(nums, k));
    }
}
