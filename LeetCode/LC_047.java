
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_047 {
    
    public List<List<Integer>> Permutations(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        helper(nums, used, temp, result);
        return result;
    }

    private void helper(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> result) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            if (i > 0 && nums[i] == nums[i - 1] && !used[i-1])
                continue;
            used[i] = true;
            temp.add(nums[i]);

            helper(nums, used, temp, result);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        LC_047 obj = new LC_047();
        int[] nums = new int[] { 1, 1, 2 };
        System.out.println(obj.Permutations(nums));
    }
}
