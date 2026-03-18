import java.util.HashSet;

public class LC_003{

    public int Long_substring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max_Len = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (!set.add(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            max_Len = Math.max(max_Len, right - left + 1);
        }
        return max_Len;

    }

    public static void main(String[] args) {
        LC_003 obj = new LC_003();
        String s = new String("abcabcbb");
        System.out.println(obj.Long_substring(s));
       
    }
    
}