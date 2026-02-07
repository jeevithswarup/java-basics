import java.util.Arrays;
public class LC66 {
    public void PlusOne() {
        int[] arr = new int[] {3,4,5,9};
         int[] arr2 = new int[arr.length + 1];
        // if (arr.length == 1 && arr[0] < 9) {
        //     arr[0] += 1;
        // } else
         if (arr[arr.length - 1] == 9) {
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr2[arr.length - 1] = 1;
        // } else {
        //     arr[arr.length - 1] += 1;
         }
        System.out.println(Arrays.toString(arr2));
    }


     public static void main(String[] args) {
         LC66 obj = new LC66();
         obj.PlusOne();
     }
}
