
import java.util.Stack;

public class LC_20 {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return false;
                if ((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{')
                        || (ch == ']' && st.peek() == '[')) {
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    


    public static void main(String[] args) {
        LC_20 obj = new LC_20();
        String s = "({[]})";
        obj.isValid(s);
        }
}
