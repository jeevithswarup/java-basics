package LeetCode;
import java.util.Arrays;
public class LC026_duplicate {
    
    public void duplicate() {
        int[] arr = new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 6 };

        Arrays.sort(arr);
   
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                } else {
                    System.out.print(arr[i]);
                }
            }
                
          
        }

    }
    public static void main(String[] args) {
        LC026_duplicate obj = new LC026_duplicate();
        obj.duplicate();
    }
}
