import java.util.ArrayList;
import java.util.Arrays;
public class LC_500 {

    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        String targetRow;
        for (String word : words) {
            String Original = word;
            word = word.toLowerCase();
            char ch = word.charAt(0);
            if(row1.indexOf(ch)!=-1){
                 targetRow = row1;
            } else if (row2.indexOf(ch) != -1) {
                targetRow = row2;
            } else {
                targetRow = row3;
            }
            boolean valid = true;
            
            for (int i = 0; i < word.length(); i++) {
                if (targetRow.indexOf(word.charAt(i)) == -1) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                list.add(Original);
            }          
        }
        

        return list.toArray(new String[0]);

    }



    
    public static void main(String[] args) {
        LC_500 obj = new LC_500();
      
        
        String[] words = new String[] { "Hello", "Alaska", "Dad", "Peace" };
        
       System.out.println(Arrays.toString(obj.findWords(words)));

    }
}
