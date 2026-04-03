
import com.sun.tools.javac.Main;

public class LC_034{
public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

       while(low<high){
        int mid=(low+high)/2;
        if(nums[mid]==target && nums[mid-1]==target){
            return  
        }
       } 

    }
    public static void main(String[] args) {
        LC_034 obj = new LC_034();
        int[] nums = new int[] {};
    }
    
}