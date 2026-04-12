public class LC_1283 {
    int total_sum = 0;

    public int smallestDivisor(int[] nums, int threshold) {
             for (int x : nums) {
            total_sum += (int)Math.ceil((double)x / 5);
         }
        return 0;
    }

    public int divisorValue(int[] nums, int threshold) {
      
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
