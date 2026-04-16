public class LC_1760 {
    
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = 0;
        for (int x : nums) {
            high = Math.max(high, x);
        }
        while (low <= high) {

            int max_balls = low + (high - low) / 2;

            if (isValid(nums, maxOperations, max_balls)) {
                high = max_balls - 1;
            } else {
                low = max_balls + 1;
            }
        }
        return low;
    }
    public boolean isValid(int[] nums, int maxOperations, int max_balls) {
        int splitCount = 0;
        for (int balls : nums) {
            if (balls > max_balls) {
                splitCount += ((balls - 1) / max_balls);
            }
            if (splitCount > maxOperations) {
                return false;
            }
        }
        return true;
    } 



    public static void main(String[] args) {
        LC_1760 obj = new LC_1760();
        int []nums=new int[]{2,4,8,2};
        int maxOperations = 4;
        System.out.println(obj.minimumSize(nums, maxOperations));
        
    }
}
