
import java.sql.Array;
import java.util.Arrays;

public class LC_3379 {
    


    public void Transformed_Element() {
        
        int[] arr = new int[] { 3, -2, 1, 1 };
        int[] result = new int[arr.length];
        int value;

        for (int i = 0; i < arr.length; i++) {
            value = arr[i];
            if (value > 0) {
                result[i] = arr[i + value];
            } else {
                result[i] = arr[i + arr.length - value];
            }     
        }
        System.out.print(Arrays.toString(result));

    }

    public static void main(String[] args) {
        LC_3379 obj = new LC_3379();
        obj.Transformed_Element();
        
     }
}