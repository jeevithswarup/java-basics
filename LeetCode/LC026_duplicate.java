import java.util.Arrays;

public class LC026_duplicate {
    
    public void Remove_duplicate() {
        int[] arr = new int[] { 1, 1, 2, 2,3,3, 4, 5, 6};
      
        int k = 0;
        
          
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[k] = arr[i - 1];
                k++;
            }
        }
        arr[k] = arr[arr.length - 1];
        k++;
     
        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, k)));




    }
    public static void main(String[] args) {
        LC026_duplicate obj = new LC026_duplicate();
        obj.Remove_duplicate();
    }
}
