import java.util.Arrays;

public class LC66 {
    public void PlusOne() {
   
        int[] arr = new int[] {  5 };
        if (arr.length == 1) {
            int i = arr[0];
            arr[0] = i % 10;
            arr[1] = i / 10;

        } else {
            int i = arr[arr.length - 1];
            i += 1;
            arr[arr.length - 1] = i;
            System.out.println(Arrays.toString(arr));
        }
    }
    
     public static void main(String[] args) {
         LC66 obj = new LC66();
         obj.PlusOne();
     }
}
