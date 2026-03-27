
import java.util.HashMap;

public class PrefixReplace {

    public int Replace(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        map.put(0, -1);
        for (int x : arr) {
            if (x == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
          
                
        }
            
        

        return 0;
    }
    public static void main(String[] args) {
        PrefixReplace obj = new PrefixReplace();
        int []arr=new int[]{0,1,1,0,0,1};
        obj.Replace(arr);
    }
}
