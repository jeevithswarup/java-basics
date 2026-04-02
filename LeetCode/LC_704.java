public class LC_704 {
    
    
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LC_704 obj = new LC_704();
        int[] nums = new int[] { -1, 1, 4, 5, 8, 9 };
        int 
    }

}
