import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LC_018{
    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        int j=i+1;
        int k=nums.length-2;
        int h=nums.length-1;
        while(k<h){
            int sum=nums[i]+nums[j]+nums[k]+nums[h];

            if(sum==target){
                result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[h]));
                j++;
                k--;
            }else if(sum < target){
                j++;
            }else{
                h--;
            }
        }
       }
       return result;
    }
public static void main(String[] args) {
        LC_018 obj = new LC_018();
        int[] nums = new int[] { 1, 0, -1, 0, -2, 2 };
        int target = 0;
       System.out.println(obj.fourSum(nums, target));
    }  
}