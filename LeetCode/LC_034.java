
import com.sun.tools.javac.Main;

public class LC_034{
public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int[] result=new int[2];
       while(low<high){
        int mid=(low+high)/2;
        if (nums[mid] == target && nums[mid - 1] == target) {
            result[0] = mid;
            result[1] = mid - 1;
            return result;
        } else if (nums[mid] == target && nums[mid + 1] == target) {
            result[0] = mid;
            result[1] = mid + 1;
        } else if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
        
       } 

    }
    public static void main(String[] args) {
        LC_034 obj = new LC_034();
        int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
        int target = 8;
       System.out.println(obj.searchRange(nums, target));
    }
    
}