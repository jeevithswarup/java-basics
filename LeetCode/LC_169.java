import java.util.*;
public class LC_169 {

    public int majority(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
         
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int ntimes = nums.length / 2;
      
        for (int key : map.keySet()) {
            
            if (map.get(key) > ntimes) {
                return key;
           } 
        }


        return -1;
  }


    public static void main(String[] args) {
        LC_169 obj = new LC_169();
        int[] nums = new int[] { 3, 2, 3};
        System.out.println(obj.majority(nums));
    }

    
    
}
