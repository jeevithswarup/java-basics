import java.util.HashMap;

public class LC_424 {
    
    public int characterReplacement(String s, int k) {
       int left=0;
       int max_length=0;
       int count=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int right = 0; right < s.length(); right++) {
            
        }
        return 0;

    }
 public static void main(String[] args) {
     LC_424 obj = new LC_424();
     String s="ABAB";
     int k = 2;
     obj.characterReplacement(s,k);
 }
}