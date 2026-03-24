import java.util.HashMap;
public class Hashmap {
    
    public int HashCheck(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);

      return 0;
    }
    public static void main(String[] args) {
        Hashmap obj = new Hashmap();
        int[] nums = new int[] { 1, 2, 2, 3, 1 };
        obj.HashCheck(nums);
    }
}