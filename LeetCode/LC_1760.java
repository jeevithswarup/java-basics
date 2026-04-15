public class LC_1760 {
    
    public int minimumSize(int[] nums, int maxOperations) {

        return 0;
    }

    public boolean isValid(int[] nums, int maxOperations, int max_balls) {
        int splitCount = 0;

        for (int balls : nums) {

            if (balls > max_balls) {
                splitCount += ((balls - 1) / max_balls);
            }
            if (splitCount >= maxOperations) {
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
