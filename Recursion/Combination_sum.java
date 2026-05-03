
import java.util.ArrayList;
import java.util.List;

public class Combination_sum{
    

    public List<List<Integer>> combinationSum(int index, int[] nums,int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        helper(index, nums, target,list, result);
        return result;
        
    }

    public void helper(int index, int[] nums, int target, List<Integer> list, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < nums.length; i++) {

            if (nums[i] <= target) {
                list.add(nums[i]);
                helper(i, nums, target - nums[i], list, result);
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        Combination_sum obj = new Combination_sum();
        int[] nums = new int[] { 2, 3, 6, 7 };
        int target = 7;
        int index=0;
        System.out.println(obj.combinationSum(index, nums, target));
    }
}