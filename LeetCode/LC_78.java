import java.util.ArrayList;
import java.util.List;
public class LC_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int index = 0;
        List<List<Integer>> result = new ArrayList<>();
            Subsequences(nums, temp, index,result);
            return result;
    }

    public void  Subsequences(int[] nums, List<Integer> temp, int index, List<List<Integer>> result) {
        if (index == nums.length) {
          result.add(new ArrayList<>(temp)); 
            return;    
        }
        temp.add(nums[index]);
        Subsequences(nums, temp, index + 1, result);

        temp.remove(temp.size()-1);
        Subsequences(nums, temp, index + 1, result);
    }
    public static void main(String[] args) {
        LC_78 obj = new LC_78();
        int[] nums = new int[] { 1, 2, 3 };
       System.out.println(obj.subsets(nums));
    }
}