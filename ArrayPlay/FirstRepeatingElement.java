import java.util.HashMap;

public class FirstRepeatingElement {
    
    public int First_Repeating_values(int[] arr) {
          HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : arr) {
            if (map.get(x) >1) {
                System.out.println(x);
             break;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        FirstRepeatingElement obj = new FirstRepeatingElement();
        int[] arr = new int[] {3, 2, 1, 2, 3};
        obj.First_Repeating_values(arr);
    }
}
