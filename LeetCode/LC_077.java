import java.util.ArrayList;
import java.util.List;

public class LC_077 {

    public List<List<Integer>> Combinations(int k, int n) {
     List<List<Integer>> result= new ArrayList<>();
     List<Integer> temp= new ArrayList<>();
     int index = 1;
    helper(index,k,n,temp,result);
        return result;
    }

    public void helper(int index, int k, int n, List<Integer> temp, List<List<Integer>> result) {

        if (k == temp.size()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i <= n; i++) {
            temp.add(i);
            helper(i + 1, k, n, temp, result);
            temp.remove(temp.size() - 1);
        }

    }
    public static void main(String[] args) {
        LC_077 obj = new LC_077();
        int k = 2;
        int n = 4;
        System.out.println(obj.Combinations(k, n));
    }
    
}
