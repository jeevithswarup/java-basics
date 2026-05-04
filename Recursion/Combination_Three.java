import java.util.ArrayList;
import java.util.List;

public class Combination_Three {

    public List<List<Integer>> combination3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int index = 1;
        helper(k, n, index, list, result);

        return result;
    }

    public void helper(int k, int n, int index, List<Integer> list, List<List<Integer>> result) {

        if (list.size() == k) {
            if (n == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
     

        for (int i = index; i <= 9; i++) {

            if (i > n)
                break;
            list.add(i);
            helper(k, n-i, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
public static void main(String[] args) {
    Combination_Three obj = new Combination_Three();
    int n = 7;
    int k = 3;
    
    System.out.print(obj.combination3(k, n));
}   
}

