import java.util.ArrayList;
import java.util.List;

public class Subsequence_sum {
    


    public List<List<Integer>> Sum_Equal_K(int[] nums, int target) {

        List<Integer> temp = new ArrayList<>();
        int index = 0;
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        Check(nums, target, temp, index, sum, result);
        return result;
    }

    public void Check(int[] nums, int target, List<Integer> temp, int index, int sum, List<List<Integer>> result) {
        if (sum > target)
            return;
        if (index == nums.length) {
            if (sum == target) {
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        temp.add(nums[index]);
        sum += nums[index];
        Check(nums, target, temp, index+1, sum, result);

        temp.remove(temp.size() - 1);
        sum -= nums[index];
        Check(nums, target, temp, index+1, sum, result);

    }
    public static void main(String[] args) {
        Subsequence_sum obj = new Subsequence_sum();
        int[] nums = new int[] { 1, 2, 1 };
        int target = 2;
        System.out.println(obj.Sum_Equal_K(nums, target));
    }
}
