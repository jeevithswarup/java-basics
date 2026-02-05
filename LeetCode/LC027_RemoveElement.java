
import java.lang.reflect.Array;
import java.util.Arrays;

public class LC027_RemoveElement {
    


    public void Remove_Element() {
        int[] arr = new int[] { 1, 3, 2, 3, 4, 5, 2, 2 };
        int k = 0;
        int target=2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[k] = arr[i];
                k++;
            }

        }
        System.out.println(k);
    System.out.println(Arrays.toString(Arrays.copyOf(arr,k)));    
    
        
    }

    public static void main(String[] args) {
        LC027_RemoveElement obj = new LC027_RemoveElement();
        obj.Remove_Element();
        
    }
}