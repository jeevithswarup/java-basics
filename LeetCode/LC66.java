import java.util.Arrays;
public class LC66 {
    public void PlusOne() {
        int[] arr = new int[] {8};
        int[] arr2 = new int[arr.length + 1];
        int count = 0;
          if (arr.length == 1 && arr[0] < 9) {
            arr[0] += 1;
        }else if (arr.length != 1 && arr[arr.length-1]==9) {
             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] == 9) {
                     count++;
                 }
             }
             int j = arr.length;
             int temp = (int) Math.pow(10, count);
             while (j >=0) {
                 arr2[j] = temp % 10;
                 temp = temp / 10;
                 j--;    
            }
           }else {
            arr[arr.length - 1] += 1;
        }
        System.out.println(Arrays.toString(arr));
    }


     public static void main(String[] args) {
         LC66 obj = new LC66();
         obj.PlusOne();
     }
}


//   if (arr.length == 1 && arr[0] < 9) {
//             arr[0] += 1;
//         } else if (arr[arr.length - 1] == 9) {
//             for (int i = 0; i < arr.length; i++) {
//                 arr2[i] = arr[i];
//             }
//             arr2[arr.length - 1] = 1;
        // } 