
public class LC_014 {    

    public String commonString(String[] s) {
        for (int i = 0; i < s[0].length(); i++) {
            char ch = s[0].charAt(i);
            for (int j = 1; j < s.length; j++) {
                if (i >= s[j].length() || s[j].charAt(i) != ch) {
                    return s[0].substring(0, i);
                }
            }
        }
        return s[0];
    }
    public static void main(String[] args) {
        LC_014 obj = new LC_014();
        String[] s = { "flower", "fly", "flight" };
        System.out.println(obj.commonString(s));
    }
}   