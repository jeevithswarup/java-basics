
import java.util.HashMap;

public class Longest_Substring {

    public int NonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max_len = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(s.charAt(right), map.getOrDefault(ch, 0) + 1);
            while (map.get(ch) > 1) {
                map.put(s.charAt(left), map.get(ch) - 1);
                left++;
            }
          
            max_len = Math.max(max_len, right - left + 1);
                    
        }



        return max_len;
    }


     public static void main(String[] args) {
         Longest_Substring obj = new Longest_Substring();
         String s = "aabbc";
         System.out.println(obj.NonRepeating(s));
     }
}
