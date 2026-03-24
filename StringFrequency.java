import java.util.HashMap;

public class StringFrequency {
    public int Frequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max_freq = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max_freq = Math.max(max_freq, map.get(ch));
        }
        System.out.println(map);

        return max_freq;
    }

    public static void main(String[] args) {
        StringFrequency obj = new StringFrequency();
        String s = "aabbbcc";
       System.out.println(obj.Frequency(s));

    }
}

  