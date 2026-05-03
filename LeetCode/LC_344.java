package LeetCode;

public class LC_344 {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length);
    }

    public void reverse(char[] s, int index, int len) {
     
        if (index >= len / 2)
            return;
        
        char temp = s[index];
        s[index] = s[len - index - 1];
        s[len - index - 1] = temp;

        reverse(s, index+1, len);

    }
   
    public static void main(String[] args) {
        LC_344 obj = new LC_344();
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        obj.reverseString(s);
    }
}

