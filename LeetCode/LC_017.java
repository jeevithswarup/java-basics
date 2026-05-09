import java.util.ArrayList;
import java.util.List;

public class LC_017 {
    

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
             String[] map = {
                "", "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
             String temp = "";
                int index = 0;

        combinations(index, digits,temp, result,map);
        return result;
    }

    public void combinations(int index, String digits,String temp, List<String> result,String[] map) {
          
        if (temp.length() == digits.length()) {
            result.add(temp);
            return;
        }
       char digit=digits.charAt(index);

       String letters= map[digit-'0'];

        for (int i =0; i <letters.length(); i++) {
            char ch = letters.charAt(i);
            combinations(index+1, digits,temp+ch, result,map);
        }
    }

    public static void main(String[] args) {
        LC_017 obj = new LC_017();
   
        System.out.println(obj.letterCombinations("23"));
        
    }
}
