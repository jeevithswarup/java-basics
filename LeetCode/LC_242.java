

public class LC_242 {
    
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length())return false;
        // char[] a = s.toCharArray();
        // char[] b = s.toCharArray();

        // Arrays.sort(a);                                             //better solution
        // Arrays.sort(b);

        // for (int i = 0; i < a.length; i++) {
        //     if (a[i] != b[i])
        //         return false;
        // }

//optimal solution        
    if (s.length() != t.length())
        return false;
    
    int[] count = new int[26];

    for(char c : s.toCharArray())count[c - 'a']++;
    for (char c : t.toCharArray())count[c - 'a']--;
    
    for (int x : count) {
        if (x != 0)
            return false;
    }

        return true;
    }

    public static void main(String[] args) {
        LC_242 obj = new LC_242();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s, t));
    }


}