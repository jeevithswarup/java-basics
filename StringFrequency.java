import java.util.HashMap;

public class StringFrequency {
    public int Frequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }System.out.println(map);

        return 0;
    }

    public static void main(String[] args) {
        StringFrequency obj = new StringFrequency();
        String s = "aabbbcc";
        obj.Frequency(s);

    }
}

  