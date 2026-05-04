import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Two {

    public List<List<Integer>> combinationSum2(int index, int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(index, nums, target, list, result);
        return result;
    }
    public void helper(int index, int[] nums, int target, List<Integer> list, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i <nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            
            if (nums[i] > target)break;   
                list.add(nums[i]);
                helper(i + 1, nums, target - nums[i], list, result);
                list.remove(list.size() - 1);
            
        
     }   
    }
        public static void main(String[] args) {
        Combination_Two obj = new Combination_Two();
        int[] nums = new int[] {10,1,2,7,6,1,5};
        int target = 8;
        int index=0;
        System.out.println(obj.combinationSum2(index, nums, target));
    }
}