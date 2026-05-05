import java.util.ArrayList;
import java.util.List;

public class LC_131 {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int index = 0;
        helper(index, s, temp, result);
        return result;
    }

    public void helper(int index, String s, List<String> temp, List<List<String>> result) {

        if (index== s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (Palindrome(index,i, s)) {
                temp.add(s.substring(index, i + 1));
                helper(i + 1, s, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean Palindrome(int start,int end, String s) {

        while (start<=end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        LC_131 obj = new LC_131();

        String s = "aabb";
        System.out.println(obj.partition(s));
    }


}