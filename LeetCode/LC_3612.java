public class LC_3612 {

    
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();         
        for (char ch : s.toCharArray()) {
            
            if (ch != '#' && ch != '*' && ch != '%') {
                result.append(ch);
            } else if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length()-1);
                }
            } else if (ch == '#') {
                String curr = result.toString();
                result.append(curr);
            
            }else{
            result.reverse();
            }
        }   

        return result.toString();
        
    }


    public static void main(String[] args) {
        LC_3612 obj = new LC_3612();
        String s = "a#b%*";
       System.out.println(obj.processStr(s));

    }
}
