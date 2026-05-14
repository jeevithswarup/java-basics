import java.util.ArrayList;
import java.util.List;

public class LC_60 {


    public String getPermutation(int n, int k) {
        
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;


        while (true) {
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);
            if (numbers.size() == 0) {
                break;
            }
            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;

    }

    public static void main(String[] args) {
        LC_60 obj = new LC_60();
        int n = 3;
        int k = 3;
        System.out.println(obj.getPermutation(n, k));
    }
}
