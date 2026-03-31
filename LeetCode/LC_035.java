

public class LC_035 {

    public int searchInsert(int []nums,int target){
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            else id    
            }
        }
        return 0;
    }
  public static void main(String[] args) {
      LC_035 obj = new LC_035();
      int[] nums = new int[] { 1, 3, 5, 6 };
      int target = 7;
      System.out.println(obj.searchInsert(nums, target));
  }
    
}
