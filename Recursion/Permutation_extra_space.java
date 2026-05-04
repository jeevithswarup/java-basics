
import java.util.ArrayList;
import java.util.List;

public class Permutation_extra_space {
    
    public List<List<Integer>> Permuntations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(nums, temp, result,used);
        return result;
    }

    public void helper(int[] nums, List<Integer> temp, List<List<Integer>> result,boolean[] used) {
    
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
       
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            
            temp.add(nums[i]);
            used[i] = true;
            helper(nums, temp, result, used);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }

   }
public static void main(String[] args) {
    Permutation_extra_space obj = new Permutation_extra_space();
    int[] nums = new int[] { 1, 2, 3 };
    System.out.println(obj.Permuntations(nums));
}

}
