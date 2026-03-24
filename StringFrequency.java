import java.util.HashMap;
import java.util.Map;
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

    public int Non_repeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }

        }
        return 0;
}

    public static void main(String[] args) {
        StringFrequency obj = new StringFrequency();
        String s = "aabbbcc";
        System.out.println(obj.Frequency(s));
        System.out.println(obj.Non_repeating(s));

    }
}

  