import java.util.HashMap;
public class Hashmap {
    
    public int HashCheck(int[] nums) {
        int j=1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length-1;i++){
            map.put(nums[i], nums[j]);
            j++;
        }
        System.out.println(map);
        return 0;
        
    }
    public static void main(String[] args) {
        Hashmap obj = new Hashmap();
        int[] nums = new int[] { 1, 2, 2, 3, 1 };
        System.out.println(obj.HashCheck(nums));
    }
}