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
        
    }
}
