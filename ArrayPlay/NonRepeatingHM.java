
import java.util.HashMap;

public class NonRepeatingHM {
    public int Non_repeating(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : nums) {
            if (map.get(x) == 1) {
                System.out.println(x);
             break;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        NonRepeatingHM obj = new NonRepeatingHM();
        int[] nums = new int[] {2,3,4,2,3,5};
        obj.Non_repeating(nums);
    }
}
