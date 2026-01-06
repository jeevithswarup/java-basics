  import java.util.Arrays;
public class TwoPointersArray {
  


    public void Swap() {
        int[] arr = new int[] { 25, 56, 85, 56, 5, 15 };
        int j = 0;
        j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        TwoPointersArray obj = new TwoPointersArray();
        obj.Swap();
    }
    
}


